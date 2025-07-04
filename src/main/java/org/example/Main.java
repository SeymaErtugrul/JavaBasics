package org.example;
import org.example.Enums.Gun;
import org.example.JavaExceptions.JavaLambdaException;
import org.example.JavaExceptions.JavaTryCatch;
import org.example.Lists.JavaArrayList;
import org.example.Lists.JavaHashMap;
import org.example.Lists.JavaHashSet;
import org.example.Lists.JavaWrapper;

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
        //TryCatch
        JavaTryCatch javaTryCatch =new JavaTryCatch();
       // javaTryCatch.tryTryCatchFunc();
        //Lambda
        JavaLambdaException lambdaException= new JavaLambdaException();
        lambdaException.tryLambdaFunc();
        //Wrapper
        JavaWrapper javaWrapper=new JavaWrapper();
      System.out.println(javaWrapper.number);
        System.out.println(javaWrapper.primitInt);
        System.out.println(javaWrapper.numInt);

    }
}