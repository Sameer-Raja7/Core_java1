package com.flm.core;

public class Palendurm {
public static void main(String[] args) {
    String str = "Aba";
    String response = "";
    for (int i =str.length()-1; i>=0; i--){
       char c =str.charAt(i);
       response += String.valueOf(c); 
    }
    if (str.equalsIgnoreCase(response)) {
      System.out.println("It is a Palendrome");
    } else {
      System.out.println("It is not a palendrome");
    }
}
}
