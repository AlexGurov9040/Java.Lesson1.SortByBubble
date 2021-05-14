package com.lesson1.task2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //filling in the array mas
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
                System.out.println("Исходный массив");
                for (int i=0;i<n;i++){
                    mas[i] = a + (int)Math.round(Math.random()*(b-a));
                    System.out.print(mas[i]+" ");
                }
                System.out.println();
                SortMas(mas);//sorting by the bubble method
                displayMas(mas);//display an array mas
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int[] SortMas(int mas[]){

        int i = 0;
        boolean tr;
        int el;
        do{
            tr = false;
            for (int j=0;j< (mas.length-i-1);j++){
                if (mas[j]>mas[j+1]){
                    el = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = el;
                    tr = true;
                }
            }
            i++;
        }
        while (tr);
        return mas;
    }
    public static void displayMas(int mas[]){
        System.out.println("Получен массив");
        for (int i=0;i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
    }
}
