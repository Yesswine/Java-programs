import java.io.*;
import java.util.*;
import java.util.Arrays;
class Alice{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("elements");
int n=s.nextInt();
int a[]=new int[n];
int u=a.length;
int i;
int j;
int count=1;
for(i=0;i<u;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<u;i++)
{
for(j=i+1;j<u;j++)
{
if(a[i]==a[j])
{
count++;
}}}
System.out.println(count);
}}
