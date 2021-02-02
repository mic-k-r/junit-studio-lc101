package main;


import java.util.ArrayList;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {

//        I overcomplicated way too much here:
//        ArrayList<Character> brackets = new ArrayList<>();
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets.add(ch);
//            } else if (ch == ']') {
//                brackets.add(ch);
//            }
//        }
//        if (brackets.contains('[')) {
//            if (brackets.indexOf('[') % 2 == 0 ) {
//                brackets.remove('[');
//            }
//        } else if (brackets.contains(']')) {
//            if (brackets.indexOf(']') % 2 != 0) {
//                brackets.remove(']');
//            }
//        }
//        return brackets.isEmpty();

        if (str == null) {
            throw new IllegalArgumentException("can't pass null");
        }

        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                if (brackets < 1) return false;
                brackets--;
            }
        } return brackets == 0;
    }
}
