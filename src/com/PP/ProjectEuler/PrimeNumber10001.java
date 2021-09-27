package com.PP.ProjectEuler;

import java.util.LinkedList;

public class PrimeNumber10001 {
    public static void primeNum10001() {

        LinkedList<Long> primes = new LinkedList<>();

        for(Long i = 0L; i < Integer.MAX_VALUE; i++){
            primes.add(i);
        }
        System.out.println(primes);

    }
}
