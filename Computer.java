import java.io.*;
import java.util.*;
class Computer{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=s.nextInt();
int b=a/10;
int c=a%n;

if(n==a){
System.out.println("yes");}
	if(n==b){
	System.out.println("yes");}
		if(c==0){
		System.out.println("yes");}
		else
System.out.println("no");}}