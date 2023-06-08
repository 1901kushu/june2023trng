import java.util.*;
class Power
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i1=sc.nextInt();
int i2=sc.nextInt();
int r=1;
for(int i=1;i<=i2;i++)r*=i1;
System.out.println(r);
}
}