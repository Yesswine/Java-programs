import java.io.*;
class PositiveDominant{
public static void main(String args[]){
int a[]={1,2,3,4,5,6,-1,-2,-3};
int n=a.length;
int count1=0;
int count2=0;
int i;
for(i=0;i<=n;i++)
{
if(i<=0)
{
count1=count1++;}
else if(i>=0){
count2=count2++;}
else{
	System.out.print(" ");
}}
if(count1<count2)
	
{
System.out.print("negative");
}
else
	System.out.print("positive");
}}