package org.example.JavaExceptions;

import java.util.ArrayList;

public class JavaLambdaException {

    public void tryLambdaFunc(){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }

}
