import java.util.*;
class Day4Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
n1=n1+n2;
n2=n1-n2;
n1=n1-n2;
System.out.println(n1+" "+n2);
}
}