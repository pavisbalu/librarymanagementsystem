package in.pavithra.practicesum;

import java.util.Stack;

public class StringReverse {
    public static String reverseString(String input) {
        Stack<String> st = new Stack<String>();
        String[] words=input.split(" ");
        for(String word:words){
            st.push(word);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            String word=st.pop();
            sb.append(word).append(" ");
        }

        return sb.toString().trim();
    }
}
