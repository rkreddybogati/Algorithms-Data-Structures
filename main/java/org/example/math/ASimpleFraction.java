package org.example.math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * Given a fraction. Convert it into a decimal.
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 * Example 1:
 * Input: numerator = 1, denominator = 3
 * Output: "0.(3)"
 * Explanation: 1/3 = 0.3333... So here 3 is
 * recurring.
 * Example 2:
 * Input: numerator = 5, denominator = 2
 * Output: "2.5"
 * Explanation: 5/2 = 2.5
 * Your Task:
 * You don't need to read or print anyhting. Your task is to complete the function fractionToDecimal() which takes numerator and denominator as input parameter and returns its decimal form in string format.
 * Note: In case, the numerator is divisible by the denominator, just print the integer value.
 * Expected Time Compelxity: O(k) where k is constant.
 * Expected Space Complexity: O(k)
 * Constraints:
 * 1 ≤ numerator, denominator ≤ 2000
 *
 */
public class ASimpleFraction {

    public static void run(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
                String[] S = new String[0];

                S = br.readLine().trim().split(" ");

                int numerator = Integer.parseInt(S[0]);
                int denominator = Integer.parseInt(S[1]);
                String ans = fractionToDecimal(numerator, denominator);
                System.out.println(ans);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String fractionToDecimal(int numerator, int denominator)
    {

        if(numerator == 0) {
            return "";
        }
        if(denominator == 0) {
            return "infinity";
        }

        StringBuilder sb = new StringBuilder();
        if(numerator < 0 || denominator < 0){
            sb.append("-1");
        }

        long divisor = Math.abs((long)numerator);
        long dividend = Math.abs((long)denominator);
        sb.append(divisor/dividend);

        if(divisor%dividend==0){
            return sb.toString();
        }
        sb.append(".");

        long reminder = divisor%dividend;
        Map<Long, Integer> map = new HashMap();
        while(reminder !=0 ) {
            if(map.get(reminder)!=null) {
                sb.insert(map.get(reminder), "(");
                sb.append(")");
                break;
            }
            map.put(reminder, sb.length());
            reminder = reminder*10;
            sb.append(reminder/dividend);
            reminder = reminder%dividend;
        }

        return sb.toString();

    }




}
