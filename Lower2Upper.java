import java.util.*;
class Lower2Upper
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String temp="";
int ascii;
for(int i=0;i<=s.length()-1;i++){
if(s.charAt(i)>='a'&&s.charAt(i)<='z')
{
ascii=s.charAt(i);
ascii-=32;
temp+=(char)ascii;}
else 
temp+=s.charAt(i);}
System.out.print(temp);
}}
