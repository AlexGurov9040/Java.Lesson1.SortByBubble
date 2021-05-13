package com.lesson1.task2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CompletionMas();
    }

    public static void CompletionMas(){

        try{
            System.out.println("Введите количество элементов массива");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n < 1){
                throw new Exception("Количество элементов массива должно быть больше 0");
            }
            try{
                System.out.println("Введите диапазон значений элементов (от.. до..)");
                int a = in.nextInt();
                int b = in.nextInt();
                if (a>b){
                    throw new Exception("Диапазон должен соответствовать правилу от < до");
                }
                int mas[] = new int[n];
                System.out.println("Получен массив");
                for (int i=0;i<n;i++){
                    mas[i] = a + (int)Math.round(Math.random()*(b-a));
                    System.out.print(mas[i]+" ");
                }
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
