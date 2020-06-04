package GenericLists;

public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> next;
    private Node<T> previous;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }



    public T getValue(){
        return this.value;
    }

    public void setData(T value){
        this.value=value;
    }

    public void setNext(Node<T> next){
        this.next=next;
    }

    public void setPrevious(Node<T> previous){
        this.previous=previous;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getPrevious(){
        return this.previous;
    }

    @Override
    public String toString() {
        return value.toString ();
    }
}