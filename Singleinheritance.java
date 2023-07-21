import java.io.*;

class Animal{
void eat(){
System.out.println("eating");}}
class Dog extends Animal{
void bark(){
System.out.println("barking");}}
class Singleinheritance{
public static void main(String args[]){
Dog c=new Dog();
c.eat();
c.bark();
}}
