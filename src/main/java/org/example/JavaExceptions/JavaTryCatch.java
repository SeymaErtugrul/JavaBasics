package org.example.JavaExceptions;

import java.util.Scanner;

public class JavaTryCatch
{

    public void tryTryCatchFunc(){
        try {
      Scanner scan= new Scanner(System.in);
      System.out.println("İki sayi giriniz ");
      int num1=scan.nextInt();
      int num2=scan.nextInt();
System.out.println(num1/num2);
        }
        catch(Exception e) {
            System.out.println("Sayi sıfıra bölünmez");
        }
    }
}
