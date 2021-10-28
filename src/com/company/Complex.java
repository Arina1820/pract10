package com.company;

public class Complex {

    public int real = 6;
    public int image = 5;

    public Complex(){
        if(image < 0){
        System.out.println(real+" - "+Math.abs(image)+"i");
    }
        if(image > 0){
            System.out.println(real+" + "+image+"i");
        }
    }

    public Complex(int real, int image){
        if(image <0){
            System.out.println(real+" - "+Math.abs(image)+"i");
        }
        if(image >0){
            System.out.println(real+" + "+image+"i");
        }
    }

    }

