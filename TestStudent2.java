class Student
{
int id;
String name;}
class TestStudent2{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();

s1.id=3023;
s1.name="Kushwanth";
s2.id=3024;
s2.name="Santhosh";
System.out.println(s1.id+"\n"+s1.name);
System.out.println(s2.id+"\n"+s2.name);

}
}