package org.example.strings;

public class ReverseWords {

    //Function to reverse words in a given string.
    public static String reverseWords()
    {
        String S = "i.like.this.program.very.much";
        // code here
        StringBuilder sb = new StringBuilder();
        String[] str = S.split("\\.");
        for(int i=str.length-1; i>=0; i--) {
            sb.append(str[i]);
            if(i!=0) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

}
