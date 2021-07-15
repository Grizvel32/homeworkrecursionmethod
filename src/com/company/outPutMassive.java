package com.company;

import java.util.Random;

public class outPutMassive {
    public static void printMassive(int mas[], int size){
        System.out.println("Исходный массив ");
        for (int i = 0; i < size; i++) {
                System.out.printf("%-5d", mas[i]);
        }
        System.out.println();
    }
    public static void printMassiveEven(int mas[], int size){
        System.out.println("Четные элементы ");
        for (int i = 0; i < size; i++) {
            if(i%2 == 0 && i!=0) {
                System.out.printf("%-5d", mas[i]);
            }
        }
        System.out.println();

    }
    public static void printMassiveOdd(int mas[], int size){
        System.out.println("Нечетные элементы ");
        for (int i = 0; i < size; i++) {
            if(i%2 != 0) {
                System.out.printf("%-5d", mas[i]);
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int size = 28;
        int bound = 50;

        int mas[] = new int[size];

        Random random  = new Random();

        for(int i = 0; i<size;i++){
            mas[i] = random.nextInt(bound);
        }
        printMassive(mas,size);
        printMassiveEven(mas,size);
        printMassiveOdd(mas,size);


    }
}

