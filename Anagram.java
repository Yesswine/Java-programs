import java.io.*;
import java.util.*;
import java.util.Arrays;
class Anagram{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String n=s.nextLine();
String m=s.nextLine();

char a[]=n.toCharArray();
Arrays.sort(a);
char b[]=m.toCharArray();
Arrays.sort(b);
int s1=a.length;
int s2=b.length;

if(Arrays.equals(a,b)==true)
{


System.out.println("It is anagram");}
else
{
	System.out.println("not anagram");
}}}
