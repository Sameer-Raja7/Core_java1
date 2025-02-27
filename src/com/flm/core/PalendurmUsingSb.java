package com.flm.core;

public class PalendurmUsingSb {
 public static void main(String[] args) {
     StringBuffer str = new StringBuffer("1221");
     String respones = str.toString();
     str.reverse().toString();
     System.out.println(respones);
     System.out.println(str);
     if (respones.equals(str.toString())) {
         System.out.println("It is a Palendurm");
     } else {
        System.out.println("It is not a Palendurm");
     }
 }
}
