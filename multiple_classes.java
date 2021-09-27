class MainClass
{
public static void main(String[] args)
{
subclass c1=new subclass();
subclass c2=new subclass();
subclass c3=new subclass();
c1.disp("sameer");
c2.disp("charan");
c3.disp("Deepika");
System.out.println(c1.myname+","+c2.myname+","+c3.myname);
}
}
class subclass
{
String msg="Hello";
String myname;
void disp(String name)
{
	myname=name;
System.out.println(msg+name);
}
}
