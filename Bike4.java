class Bike{ 
final void run()
{
System.out.println("running");
}
}
class RoyalEnfield extends Bike
{
void run()
{
System.out.println("running safely with 100kmph");
}
public static void main(String args[])
{
RoyalEnfield obh=new RoyalEnfield();
obh.run();
}}

