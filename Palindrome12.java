import java.util.*;
class Palindrome12
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
//s=s.toLowerCase();
String rev="";
for(int i=s.length()-1;i>=0;i--){rev+=s.charAt(i);}
if(s.equalsIgnoreCase(rev))
System.out.print("YES");
else
System.out.println("NO");
}}
