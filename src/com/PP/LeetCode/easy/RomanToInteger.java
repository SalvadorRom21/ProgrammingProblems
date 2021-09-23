/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IV. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */
package com.PP.LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String romanNum){

        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        char[] charArray = romanNum.toCharArray();
        int previous = romanMap.get(charArray[charArray.length - 1]);
        int sum = previous,curr;

        for(int i = charArray.length-2; i >=0; i--){
            curr = romanMap.get(charArray[i]);
            if(curr < previous){
                sum -= curr;
            }else
            {
                sum+= curr;
            }
            previous = curr;
        }
        return sum;
    }

}

/*
Solution

We will use a hashmap to solve this problem.
We map each character to its value to start off the solution.

After we have mapped everything we start adding from right to left.
In roman numerals the letter to the left are higher values.
The special cases are only if the number that comes to the left of a letter is lower.
Then we hit a special case like IV which equals 4 or IX which equals 10. These numbers have
a lower value to the left of them and we will use this fact to solve the problem.

Start from right if the current number is not lower than the previous number than we add the value to our sum
If it is... then we subtract that value to our sum and continue down the letters.
We do this unitl all the characters in the array are taken care of.

This algorithm has a Time Complexity of O(n). n being the length of the char array
This algorithm has a Space Complexity of O(n). Since we have to create a character array to
store the string this will take O(n) Space.

Testing

System.out.println(RomanToInteger.romanToInt("MMMDDDIIIV"));
 */

