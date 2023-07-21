import java.io.*;

class Quadrilateral{

}
class Rectangle extends Quadrilateral{
void arearect(){
	int l=2;
	int b=2;
	int h=2;
int c=l*b*h;
System.out.println(c);}}
class Square extends Quadrilateral{
void areasqa(){
	int l=2;
int e=l*l;
System.out.println(e);}}
class Trapezium extends Quadrilateral{
	void areatrap(){
		int l=2;
		int h=4;
		int b=3;
		int y=l+b*h/2;
System.out.println(y);}}
class paralleogram extends Quadrilateral{
	void areapara(){
		int b=4;
		int h=2;
		int i=b*h;
System.out.println(i);}}

class Tests{
public static void main(String args[]){
Square f=new Square();
Rectangle g=new Rectangle();
Trapezium j=new Trapezium();
paralleogram k=new paralleogram();
g.arearect();
f.areasqa();
j.areatrap();
k.areapara();

}}
