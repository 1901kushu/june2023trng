class Student
{
int rollno;
String name;
Student(){rollno=0;name=null;}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name);}
}
class TestStudent5{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student(123,"kushu");

s1.display();
s2.display();


}
}