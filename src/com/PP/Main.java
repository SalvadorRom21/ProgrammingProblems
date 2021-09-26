package com.PP;

import com.PP.LeetCode.easy.*;
import com.PP.ProjectEuler.*;
import com.PP.Interviews.*;

import java.util.HashMap;
import java.util.Map;
/*
LRU least recently used -
isEmtpy
Full
Popped element
Adding element
Check if exist.
 */


/*

node(){
int element
int count++
 */

/*
Hashmap<K,element>


input <Integers,Floats>

 */
public class Main {

    Map<Integer,Element> LRUcache = new HashMap<>();
    int Limit = 10;
    int LastUsed;
    public static void main(String[] args) {
    }
    public void addElement(Element value, int Key){

        if(LRUcache.isEmpty()){
            LRUcache.put(Key,value);
        }
        if(LRUcache.size() == 10){
            LRUcache.

            LRUcache.remove(LastUsed);
            LRUcache.put(Key,value);

        }else{
            LRUcache.put(Key,value);
        }

    }

}
