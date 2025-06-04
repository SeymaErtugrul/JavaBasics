package org.example;
import org.example.Enums.Gun;
import org.example.Lists.JavaArrayList;
import org.example.Lists.JavaHashMap;
import org.example.Lists.JavaHashSet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        JavaArrayList javaArrayList=new JavaArrayList();
        javaArrayList.arrayListFunc();
        Gun today= Gun.CARSAMBA;
        System.out.println("Bugün günlerden: " + today);
        //Hashset
        JavaHashSet javaHashSet=new JavaHashSet();
        javaHashSet.tryJavaHashSet();
        //Hashmap
        JavaHashMap javaHashMap=new JavaHashMap();
        javaHashMap.tryHashMap();
    }
}