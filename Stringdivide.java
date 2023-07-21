

import java.io.*;
import java.util.*;
import java.util.Arrays;
 class Stringdivide { 
    public static void main(String[] args) {  
	Scanner s=new Scanner(System.in);
String n=s.nextLine();
        int len = n.length();  
        System.out.print("no of divisions");
        int div=s.nextInt();  
        int temp = 0, chars = len/n;  
        
        String[] Str = new String [n]; //Stores the array of string  
       
        if(len % div != 0) {  
            System.out.println("string cannot be divide");  
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                
                String part = str.substring(i, i+chars); //Dividing string in n equal part using substring() 
                Str[temp] = part;  
                temp++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(Str[i]);  
                }  
            }  
        }  
}