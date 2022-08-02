package ru.netology.sqr.sqrmaven.services;

public class SQRService {
    public long counts(long initialvalue, long finalvalue) {
        //int initialvalue = 200;
        //int finalvalue = 300;
        long count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= initialvalue & i * i <= finalvalue) {
                count++;
                continue;
            }
        }
        //System.out.println("В диапазон попадают "+ count + " квадрата чисел");
        return count;


    }


}


