package com.company;

import java.util.Random;

public class CountRainFall {
    public  static int countRainFall(int masRainFall[], int days){
        int count = 0;
        for (int i = 0; i < days; i++) {
            if(masRainFall[i] == 0){
                count++;
            }
        }
        return count;
    }
    public static void printMassive(int mas[], int days){
        for (int i = 0; i < days; i++) {
           System.out.printf("%-5d", mas[i]);
        }

    }
    public static void main(String[] args) {
        int days = 28;
        int bound = 50;

        int masRainFall[] = new int[days];

        Random random  = new Random();

        for(int i = 0; i<days;i++){
            masRainFall[i] = random.nextInt(bound);
        }
        printMassive(masRainFall,days);
        System.out.println("Количество дней без осадков: ");
        System.out.println(countRainFall(masRainFall,days));
    }
}
