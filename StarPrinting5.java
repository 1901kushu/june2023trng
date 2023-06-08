import java.util.*;
class StarPrinting5
{
public static void printLine(char c,int i)
{
System.out.println();

for(int j=1;j<=i;j++)
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
int x,y;
if(i1%2==0){x=y=i1/2;}
else{x=i1/2;y=i1/2+1;}
printLine(c1,x);
star(c1,y);




}}




