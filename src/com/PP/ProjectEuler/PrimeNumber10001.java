package com.PP.ProjectEuler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumber10001 {


    public static void primeNum10001() {

        int count = 0;
        outerloop:
        for(int n = 3; n < Integer.MAX_VALUE; n++) {
            boolean isPrime = true;
            int i = 2;
            while (i <= n / 2) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if(isPrime){
                count++;
                if(count == 10000){
                    System.out.println(n);
                    break outerloop;
                }
            }
        }
    }
}
