import java.io.*;
class Upper{
public static void main(String args[]){
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int n=a.length;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{

System.out.print(a[i][j]);
}}}}
