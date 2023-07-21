import java.io.*;
class Bike1{

int a;
String b;


Bike1(int i,String c){
	a=i;
	b=c;
}
void display()
{
	System.out.println(a+" "+b);
}

public static void main(String args[]){
Bike1 x=new Bike1(1,"hhh");
Bike1 y=new Bike1(2,"ZZZZ");
x.display();
y.display();
}}

