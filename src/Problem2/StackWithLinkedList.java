package Problem2;

public class StackWithLinkedList {
    DoublyLinkedList list;

    StackWithLinkedList() {
        list = new DoublyLinkedList();
    }

    public void push(Integer x) {
        if (x == null) return;
        list.add(x);
    }

    public Integer peek() {
        if (list == null || list.size() == 0) return null;
        else {
            return list.get(list.size() - 1);
        }
    }

    public Integer pop() {
        if (list == null || list.size() == 0) return null;
        else {
            Integer value = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return value;

        }
    }

    public boolean isEmpty() { // true if stack is empty
        return list == null || list.size() == 0;
    }
    public int size(){ // returns number of items in the stack
        return list.size();
    }
    @Override
    public String toString() {
        if(list.size() == 0) return "<empty>";

        return list.toString();
    }
}
