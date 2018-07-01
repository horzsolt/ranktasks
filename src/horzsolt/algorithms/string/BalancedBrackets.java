package horzsolt.algorithms.string;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else if (isCloseTerm(c)) {
                if (stack.isEmpty() || !matches(stack.pop(), c)) return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOpenTerm(char c) {
        if (c == '(' || c == '{' || c == '[') return true;
        return false;
    }

    public static boolean isCloseTerm(char c) {
        if (c == ')' || c == '}' || c == ']') return true;
        return false;
    }

    public static boolean matches(char c, char d) {
        if (c == '{' && d == '}') return true;
        if (c == '(' && d == ')') return true;
        if (c == '[' && d == ']') return true;
        return false;
    }
}
