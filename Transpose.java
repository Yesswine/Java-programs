import java.io.*;
class Transpose{
public static void main(String args[]){
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]=new int[3][3];
int i;
int j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=a[j][i];
}}
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
System.out.print(b[i][j]);
} 
System.out.println();
}}}