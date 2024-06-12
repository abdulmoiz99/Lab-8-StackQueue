package Problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (size() == arr.length - 1) {
            resize();
        }
        if (front == -1) {
            front = 0;
        }
        arr[rear++] = obj;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int item = arr[front];
        if (front == rear) {
            front = -1;
            rear = 0;
        } else {
            front++;
        }
        return item;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        return rear;
    }

    private void resize() {
        System.out.println("resizing queue");
        arr = Arrays.copyOf(arr, 2 * size());
    }
}