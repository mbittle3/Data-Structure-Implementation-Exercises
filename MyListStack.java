/*
 * Stack LinkedListImplementation
 */
package standardListNode;

/**
 *
 * @author Marc Bittle
 */
public class MyListStack<AnyType> {

    // header node - variable to keep track of the top element of stack
    private ListNode<AnyType> stackTop = null;

    // ***CONSTRUCTOR *** \\
    public MyListStack() {
        stackTop = null; // initialize stack to be empty
    }

    /**
     * Test if stack is logically empty
     *
     * @return true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stackTop == null;
    }

    /**
     * Make stack logically empty by setting reference to top of stack null
     */
    public void makeEmpty() {
        stackTop = null;
    }

    /**
     * Insert item x onto the stack
     *
     * @param x item being added to the stack
     */
    public void push(AnyType x) {
        stackTop = new ListNode<AnyType>(x, stackTop);
    }

    /**
     * Remove the most recently inserted item - top of stack
     */
    public void pop() {
        if (isEmpty()) { // check if stack is empty
            throw new NullPointerException("Empty Stack");
        }
        stackTop = stackTop.next; // advance the stackTop to the next item in stack - remove top item
    }

    /**
     * View the item at the top of stack
     *
     * @return item at top of stack
     */
    public AnyType peek() {
        if (isEmpty()) { // check if stack is empty
            throw new NullPointerException("Empty Stack");
        }
        return stackTop.data;
    }

    /**
     * Remove and return the most recently inserted item
     *
     * @return item being popped from top of stack
     */
    public AnyType peekAndPop() {
        if (isEmpty()) { // check if stack is empty
            return null;
        }
        AnyType top = stackTop.data; // save data of top element so it can be returned
        stackTop = stackTop.next; // advance pointer to next item in stack
        return top; // top item 
    }
}
