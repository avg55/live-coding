package ag.code.interview;

import java.util.*;

// Правильные скобки
class ValidParentheses {

    static boolean isValid(final String input) {

        Map<Character, Character> pairs = Map.of(
                '}', '{',
                ')', '(',
                ']', '['
        );
        char[] chars = input.toCharArray();

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < chars.length; i++) {
            Character current = chars[i];
            if (pairs.containsValue(current)) {
                stack.push(current);
            }
            if (pairs.containsKey(current)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character possiblePair = stack.pop();
                if (!possiblePair.equals(pairs.get(current))) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("-(1+2)")); // true
        System.out.println(isValid("([]){}")); // true
        System.out.println(isValid("[(])"));  // false
        System.out.println(isValid("[("));  // false
        System.out.println(isValid("}}"));  // false
        // System.out.println(isValid(""));  //
    }
}