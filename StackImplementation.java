/*
 * Utilize a stack to solve the balanced bracket
 * problem
 */
package stackimplementation;

/**
 *
 * @author Marc Bittle
 */
public class StackImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test cases
        boolean validSeq = bracketSequence("}[({}[])]{");
        boolean validSeq2 = bracketSequence("{(([])[])[]}");
        boolean validSeq3 = bracketSequence("{(([])[])[]]}");
        boolean validSeq4 = bracketSequence("{(([])[])[]}[]");
        boolean validSeq5 = bracketSequence("{{([])}}");
        boolean validSeq6 = bracketSequence("{{)[](}}");
        boolean validSeq7 = bracketSequence("{[()]}");
        boolean validSeq8 = bracketSequence("{[(])}");
        boolean validSeq9 = bracketSequence("{{[[(())]]}}");

        // Output
        System.out.println(validSeq);
        System.out.println(validSeq2);
        System.out.println(validSeq3);
        System.out.println(validSeq4);
        System.out.println(validSeq5);
        System.out.println(validSeq6);
        System.out.println(validSeq7);
        System.out.println(validSeq8);
        System.out.println(validSeq9);

    }

    /**
     * Determines if given bracket is balanced
     *
     * @param str string of characters containing opening/closing brackets
     * @return true if the sequence is balanced, false otherwise
     */
    public static boolean bracketSequence(String str) {
        // Instantiate a new stack object
        MyListStack<Character> newStack = new MyListStack<>();

        // loop through elements in string
        for (int i = 0; i < str.length(); i++) {
            // variable to hold invidual characters of given string
            char bracket = str.charAt(i);

            // push all opening brackets onto stack
            // continue to next iteration until closing bracket is reached
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                newStack.push(bracket);
                continue;
            }

            // if the character read is a closing bracket and there are no elements
            // in stack then bracket is not balanced
            if (newStack.isEmpty()) {
                return false;
            }

            switch (bracket) {
                case '}':
                    bracket = newStack.peek(); //save element for comparision
                    newStack.pop(); // pop top element 

                    if (bracket == '[' || bracket == '(') {
                        return false;
                    }
                    break;
                case ']':
                    bracket = newStack.peek();
                    newStack.pop();

                    if (bracket == '{' || bracket == '(') {
                        return false;
                    }
                    break;
                case ')':
                    bracket = newStack.peek();
                    newStack.pop();

                    if (bracket == '{' || bracket == '[') {
                        return false;
                    }
                    break;
            }
        }
        return newStack.isEmpty(); // End of sequence has been reached. If stack is empty, then all brackets have found a mate - return true
    }
}
