package com.bootcoding.project.utils;

import java.util.Random;

public class PhoneNumberGenerator{
        //9999999999
        //1000000000
        static Random random=new Random();
        static final long Max= 9999999999l;
        static  final long Min=5000000000l;
        public static long getPhoneNumber() {
            return Min+random.nextLong(Max-Min);
        }
        public static void main(String[]args){
            long PhoneNumber=PhoneNumberGenerator.getPhoneNumber();
            System.out.println(PhoneNumber);

        }
    }

