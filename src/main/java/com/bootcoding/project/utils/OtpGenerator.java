package com.bootcoding.project.utils;

import java.util.Random;

public class OtpGenerator {
    //999999
    //100000
 static    Random random=new Random();
 static final int Max=999999;
 static  final int Min=100000;
    public static int getOtp() {
        //int Otp=random.nextInt();
        //return Otp;
        return Max+random.nextInt(Max-Min);
    }
    public static void main(String[]args){
        int otp=OtpGenerator.getOtp();
        System.out.println(otp);

    }
}
