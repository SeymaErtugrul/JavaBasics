package org.example.Lists;

import java.util.HashMap;

public class JavaHashMap {
    public void tryHashMap()
    {
        HashMap<String,Integer> personGrades = new HashMap<String, Integer>();
        personGrades.put("Ahmet",90);
        personGrades.put("Ayşe",85);
        personGrades.put("Şeyma",100);

        personGrades.forEach( (names, grades) -> { System.out.println(names + " : " + grades); } );
    }
}
