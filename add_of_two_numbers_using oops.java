class main
{
int addnumbers(int a,int b)
{
int sum=a+b;
return sum;

}
public static void main(String[] args)
{
int num1=25;
int num2=15;
main obj=new main();
int result=obj.addnumbers(num1,num2);
System.out.println("Sum is="+result);
}
}
