package com.flm.core;

public class StringBufferTest {
 public static void main(String[] args) {
     /*StringBuffer sb = new StringBuffer();
     sb.append("Hello");
     System.out.println(sb);
     sb.append("  World");
     System.out.println(sb);
     System.out.println(sb.length());
     System.out.println(sb.reverse());
     String result = sb.toString();
     System.out.println(result.toUpperCase());
     */
    /*StringBuffer sb = new StringBuffer("ABR");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    */
    
    /*String str ="HEllo world";
    char[] chars =str.toCharArray();
    System.out.println(chars);
    */
    StringBuffer str = new StringBuffer("Hello");
		for(int i=1;i<=50;i++)
			str.append(i);
		System.out.println(str);
		str.delete(0, str.length());
		System.out.println("-------------------------");
		System.out.println(str.length());
    String str1 ="Hello";
    String s = str1.replaceAll("11", "abc");
    System.out.println(s);
 }
}
