package Problem2;

public class Main {
    public static void main(String[] args) {
        StackWithLinkedList st = new StackWithLinkedList();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size = " + st.size());
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
