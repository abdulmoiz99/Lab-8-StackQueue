package Problem2;

public class DoublyLinkedList {
    Node header;
    DoublyLinkedList(){
        header = new Node(null,null, null);
    }
    public Node add(Integer item){
        if(item == null)
            throw new NullPointerException();

        Node n = new Node(header.next,header,item);
        if(header.next != null){
            header.next.previous = n;
        }
        header.next = n;
        return n;
    }
    private Node getNode(int pos){
        if (pos >= size()) throw new IndexOutOfBoundsException();
        Node next = header;
        for(int i = 0; i <= pos; ++i){
            next = next.next;
        }
        //next is the node we are seeking
        return next;
    }

    public Integer get(Integer pos){
        Node node = getNode(pos);
        return (node != null) ? node.value : null;
    }
    public boolean remove(int index){
        Node toBeRemoved = getNode(index);
        if(toBeRemoved == null) return false;
        Node previous = toBeRemoved.previous;
        Node next = toBeRemoved.next;
        previous.next = toBeRemoved.next;
        if(next != null){
            next.previous = toBeRemoved.previous;
        }
        toBeRemoved = null;
        return true;
    }
    public int size(){
        int count = 0;
        Node next = header.next;
        while(next != null){
            ++count;
            next = next.next;
        }
        return count;
    }

    public String toString(){
        boolean hasElements = false;
        StringBuilder sb = new StringBuilder("[");
        Node next = header.next;
        while(next != null){
            sb.append(next.value+", ");
            next = next.next;
            hasElements = true;
        }
        String ret = sb.toString();
        ret = hasElements ? ret.substring(0,ret.length()-2) : ret;
        return (ret +"]");
    }
    class Node  {
        Integer value;
        Node next;
        Node previous;
        Node(){}
        Node(Node next, Node previous, Integer value){
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
    }

}
