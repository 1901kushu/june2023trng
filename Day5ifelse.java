import java.util.*;
class Day5ifelse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
if(n2==0)
System.out.println("Error");
else
System.out.println(n1+"/"+n2+"="+(n1/n2));
}
}