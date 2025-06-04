package org.example.Lists;

import java.util.ArrayList;

public class JavaArrayList {

    public void arrayListFunc(){
        ArrayList<String> cities= new ArrayList<String>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.set(0,"İstanbul");

        for (String city : cities)
        {
            System.out.println(city);
        }
    }
}
