import GenericLists.List;
import Sort.Sorting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsForSorting {
    @Test
    public void sortingTest(){
        List<Integer> testListForBubble = new List<Integer> ();
        List<Integer> testListForSelection = new List<Integer> ();
        List<Integer> testListForInsertion = new List<Integer> ();
        testListForBubble.addFirst (100);
        testListForBubble.addLast (1000);
        testListForBubble.addLast (5);
        testListForBubble.addFirst (150);
        testListForSelection.addFirst (100);
        testListForSelection.addLast (1000);
        testListForSelection.addLast (5);
        testListForSelection.addFirst (150);
        testListForInsertion.addLast (100);
        testListForInsertion.addLast (1000);
        testListForInsertion.addLast (5);
        testListForInsertion.addFirst (150);
        Sorting testBubbleSort = new Sorting (testListForBubble);
        Sorting testSelectionSort = new Sorting (testListForSelection);
        Sorting testInsertionSort = new Sorting (testListForInsertion);
        testBubbleSort.bubbleSort ();
        testSelectionSort.selectionSort ();
        testInsertionSort.insertionSort ();


        assertEquals (-1, testBubbleSort.listForSort.find (9));
        assertEquals (2, testBubbleSort.listForSort.find (100));
        assertEquals (0, testListForBubble.find (1000));

        assertEquals (-1, testSelectionSort.listForSort.find (9));
        assertEquals (2, testSelectionSort.listForSort.find (100));
        assertEquals (0, testListForSelection.find (1000));

        assertEquals (-1, testInsertionSort.listForSort.find (9));
        assertEquals (2, testInsertionSort.listForSort.find (100));
        assertEquals (0, testListForInsertion.find (1000));
        assertEquals ("1000 150 100 5 ", testListForInsertion.toString ());
    }
}
