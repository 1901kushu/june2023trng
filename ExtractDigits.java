import java.util.*;
class ExtractDigits
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String res="";
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)>='0'&&s.charAt(i)<='9')
{
res+=s.charAt(i);
}}
System.out.print(res);
}}
