package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {


        Random ran = new Random();
        int nxt = ran.nextInt(10);
        System.out.println("Можно ли идти гулять" + nxt);


    }

    public static int generateRandomAge() {
        int age = (int)(Math.random() * ((0+150)))+0;
        return age ;

    }

}


