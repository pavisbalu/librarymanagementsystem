package in.pavithra.practicesum;

import java.util.Stack;

public class ReverseString {

    public static String reverseWords(String input) {
        Stack<String> stack = new Stack<String>();
        String[] words = input.split(" ");
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            String word = stack.pop();
            builder.append(word).append(" ");
        }

        return builder.toString().trim();
    }
}
