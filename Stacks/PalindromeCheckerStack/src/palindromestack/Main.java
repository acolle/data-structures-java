package palindromestack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String str) {
        // Personal solution
//        if (str != null) {
//            // clean strings
//            String cleanStr = str.toLowerCase().replaceAll("\\s","").replaceAll("\\W", "");
//            Deque<Character> stack = new ArrayDeque<Character>();
//            for (Character c: cleanStr.toCharArray()) {
//                stack.push(c);
//            }
//
//            StringBuilder palindrome = new StringBuilder(cleanStr.length());
//            for (int i = stack.size() - 1; i >= 0; i--) {
//                palindrome.append(stack.pop());
//            }
//
//            if (cleanStr.equals(palindrome.toString())) {
//                return true;
//            }
//            return false;
//        }
//        return false;

        // Course Solution
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(str.length());
        String lowerCase = str.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}
