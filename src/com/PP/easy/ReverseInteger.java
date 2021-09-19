/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */

package com.PP.easy;
public class ReverseInteger {

    public static int reverse(int x){

        long results = 0;
        while(x !=0){
            results = (results * 10) + x%10;
            x /= 10;
        }

        if(results > Integer.MAX_VALUE || results < Integer.MIN_VALUE)
            return 0;


        return (int) results;
    }
}
/*
Solution
While x doesnt equal 0

store the last digit into results
divide x by 10. since its integer it will get rid of the decimal
repeat the process

check that results are still inbounds otherwise return 0;

This algorithm will be Time complexity of O(n) where n is the length of the number.
This algorithm will be Space complexity of O(1).

 */
