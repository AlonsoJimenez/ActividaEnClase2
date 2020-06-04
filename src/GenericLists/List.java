package GenericLists;


public class List<T extends Comparable<T>> {
    public Node<T> first = null;
    public Node<T> last = null;
    private int index = 0;

    public void swap(Node<T> firstReference, Node<T> secondReference){
        T holdValue = firstReference.getValue ();
        firstReference.setData (secondReference.getValue ());
        secondReference.setData (holdValue);
    }

    public int getIndex(){
        return this.index;
    }

    public void addFirst(T data){
        if(first==null){
            first = new Node<T> (data);
            last=first;
            first.setPrevious(null);
            first.setNext(null);
        }else{
            Node<T> addingElement = new Node<> (data);
            first.setPrevious(addingElement);
            addingElement.setNext(first);
            first = addingElement;
        }
        index++;
    }

    public void addLast(T data){
        if(first==null){
            last = new Node<T> (data);
            first = last;
        }else{
            Node<T> addingElement = new Node<T> (data);
            last.setNext(addingElement);
            addingElement.setPrevious(last);
            last = addingElement;
        }
        index++;
    }

    public void deleting (T data){
        index--;
        Node<T> pointerHead = first;
        Node<T> pointerTail = first;

        while(pointerHead!=null){
            if(pointerHead.getValue().compareTo (data)==0){
                if(pointerHead==first){
                    first.getNext().setPrevious(null);
                    first = pointerHead.getNext();
                    return;
                }else{
                    if(pointerHead==last){
                        pointerTail.setNext(null);
                        last = pointerTail;
                    }else {
                        pointerTail.setNext(pointerHead.getNext());
                        pointerHead.getNext().setPrevious(pointerTail);
                    }
                }
            }else{
                pointerTail = pointerHead;
                pointerHead = pointerHead.getNext();
            }
        }
    }

    public int find(T e) {
        Node<T> temp = this.first;
        int index = 0;
        while (temp!=null) {
            if ( temp.getValue().compareTo(e)==0 ) {
                return index;
            }
            index++;
            temp = temp.getNext();
        }
        return -1;
    }

    @Override
    public String toString() {
        if(this.first==null){
            return "Empty";
        }else{
            StringBuilder returning = new StringBuilder ();
            Node<T> pointer = first;
            while(pointer!=null){
                returning.append (pointer.toString ());
                returning.append (" ");
                pointer = pointer.getNext ();
            }
            return returning.toString ();
        }
    }
}
