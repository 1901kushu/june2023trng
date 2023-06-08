import java.util.*;
class StarPrinting
{
public static void star(char c,int i)
{
for(int j=1;j<=i;j++)
{
for(int k=1;k<=j;k++)
{
System.out.print(c);
}
System.out.println();

}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c1=sc.next().charAt(0);
int i1=sc.nextInt();
star(c1,i1);
}}




