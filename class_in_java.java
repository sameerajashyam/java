class Main
{
int id;
String name;
int salary;
void setid(int i)
{
id=i;
}
void setname(String n)
{
name=n;

}
void setsalary(int s)
{
salary=s;
}
void getEmployeeDetails()
{
System.out.println("salary is"+salary);
}
public static void main(String[] args)
{
Main emp=new Main();
emp.setid(10);
emp.setname("sameer");
emp.setsalary(10000000);


}
}