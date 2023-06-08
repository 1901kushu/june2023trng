import java.util.*;
class StarPrinting3
{
public static void printLine(char c,int col)
{
System.out.println();

for(int j=1;j<=col;j++)
System.out.print(c);
}
public static void star(char c,int n){

for(int i=n;i>=0;i--){
printLine(c,i);

}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c1=sc.next().charAt(0);
int i1=sc.nextInt();
star(c1,i1);
}}




