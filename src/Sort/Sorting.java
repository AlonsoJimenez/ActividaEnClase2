package Sort;

import GenericLists.List;
import GenericLists.Node;

public class Sorting {
    public Sorting(List<Integer> listForSort){
        this.listForSort = listForSort;
    }
    public List<Integer> listForSort;


    public void bubbleSort(){
        for(int bubbleIndexOut = listForSort.getIndex()-1; bubbleIndexOut > 1; bubbleIndexOut--){
            Node<Integer> pointerHead = listForSort.first.getNext ();
            Node<Integer> pointerTail = listForSort.first;
            for(int bubbleIndexIn = 0; bubbleIndexIn < bubbleIndexOut; bubbleIndexIn++) {
                if ( pointerHead.getValue () > pointerTail.getValue () ) {
                    listForSort.swap (pointerHead, pointerTail);
                }
                pointerHead = pointerHead.getNext ();
                pointerTail = pointerTail.getNext ();
            }
        }
    }


    private Node<Integer> findBiggest(int start, int end) {
        int toStart = 0;
        Node<Integer> pointer = listForSort.first;
        while (toStart < start){
            pointer = pointer.getNext ();
            toStart++;
        }
        Node<Integer> biggest = pointer;
        pointer = pointer.getNext ();

        for ( int index = start + 1; index < end; index++ ) {
            if ( pointer.getValue () > biggest.getValue () ) {
                biggest = pointer;
            }
            pointer = pointer.getNext ();
        }
        return biggest;

        }


    public void selectionSort(){
        int endIndex = listForSort.getIndex ();
        Node<Integer> pointer = listForSort.first;
        for(int start = 0; start < endIndex; start++){
            listForSort.swap (pointer, findBiggest (start, endIndex));
            pointer = pointer.getNext ();
        }
    }

    public void insertionSort(){
        int out;

        Node<Integer> pointerHead = listForSort.first.getNext();
        Node<Integer> pointerTail = listForSort.first;

        while(pointerHead!=null){
            Node<Integer> tempHead = pointerHead;
            Node<Integer> tempTail = pointerTail;
            while(pointerTail!=null &&  pointerTail.getValue() < pointerHead.getValue()){
                listForSort.swap (pointerHead, pointerTail);
                pointerHead = pointerTail;
                pointerTail = pointerTail.getPrevious ();
            }
            pointerHead = tempHead.getNext ();
            pointerTail = tempTail.getNext ();

        }
    }

}
