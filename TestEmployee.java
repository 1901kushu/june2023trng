class Employee
{
int id;
String name;
float salary;
void insert(int i,String n,float s){
id=i;
name=n;
salary=s;
}
void display(){System.out.println(id+" "+name+" "+salary);}
}
class TestEmployee{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
e1.insert(1,"t",123);
e2.insert(1,"tk",122);

e1.display();
e2.display();
}
}