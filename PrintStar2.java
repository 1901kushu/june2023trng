import java.util.*;
class PrintStar2
{
public static void print_a_star(int i,char c)
{
int k=0;
for(k=1;k<=i;k=k+1)
System.out.println(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
char c=sc.next().charAt(0);
print_a_star(j,c);
print_a_star(j+1,c);
print_a_star(j+2,c);


System.out.println("");


}
}


