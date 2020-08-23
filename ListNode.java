/*
 * This class contains the basic contructors for
 * building standard LinkedList node
 */
package stackimplementation;

/**
 *
 * @author Marc Bittle
 */
class ListNode<AnyType> {

    AnyType data; // data stored in node
    ListNode next; // pointer to next node in list

    // ***CONSTRUCTORS*** \\
    /**
     * Initializes a node with pointer to null
     *
     * @param theData the item being stored in the node
     */
    public ListNode(AnyType theData) {
        this(theData, null);
    }

    /**
     * Initializes a new node with a pointer to the next node
     *
     * @param theData the item being stored in the node
     * @param n pointer to the next node in the list
     */
    public ListNode(AnyType theData, ListNode<AnyType> n) {
        data = theData;
        next = n;
    }
}
