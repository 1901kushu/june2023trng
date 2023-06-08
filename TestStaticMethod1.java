class Student
{
int rollno;
String name;
static String college="mtiet";
static void change(){
college="mtiet";
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class TestStaticMethod1
{
public static void main(String args[])
{
Student.change();
Student s1=new Student(111,"karan");
Student s2=new Student(222,"Aryan");
s1.display();
s2.display();
}}

