package org.example.Lists;

import java.util.HashSet;

public class JavaHashSet
{
    public void tryJavaHashSet()
    {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("elma");
        fruits.add("elma");
        fruits.add("armut");
        fruits.add("kiraz");

        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
