import java.util.*;
class Upper2Lower1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String temp="";
int ascii;
for(int i=0;i<=s.length()-1;i++){
if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
{
ascii=s.charAt(i);
ascii+=32;
temp+=(char)ascii;}
else 
temp+=s.charAt(i);}
System.out.print(temp);
}}
