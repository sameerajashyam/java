import java.util.Scanner;
class main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s=sc.nextLine();
System.out.println("enter the character to get index of it");
char ch=sc.nextLine().charAt(0);
System.out.println(s.indexOf(ch));
}
}
