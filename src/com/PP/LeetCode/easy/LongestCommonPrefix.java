/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */

package com.PP.LeetCode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String LongestPrefix(String[] strs){
        char prev;
        StringBuilder results = new StringBuilder();
        char character = 0;

        Arrays.sort(strs, (a,b)-> b.length() - a.length());
        if(strs.length == 1){
            return strs[0];
        }
        int words = strs.length -1;
        int shortest = strs[words].length();
        if(shortest == 1){
            return results.toString() + strs[words].charAt(0);
        }

        for(int p = 0; p < shortest; p++){
            prev = strs[words].charAt(p);
            for(int i = 0; i < words; i++){
                character = strs[i].charAt(p);
                if(character != prev){
                    return results.toString();
                }
            }
            results.append(character);
        }
        return results.toString();
    }
}
