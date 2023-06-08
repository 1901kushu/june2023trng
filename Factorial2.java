import java.util.*;
class Factorial2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i1=sc.nextInt();
int sum=1,i=1;
while( i<=i1){
sum*=i;
i++;}
System.out.println(sum);
}
}