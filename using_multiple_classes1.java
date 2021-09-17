
public class Main
{
  public static void main(String[] args)
  {
      subClass sc1=new subClass();
      subClass sc2=new subClass();
      subClass sc3=new subClass();
      sc1.display("Sai kiran");
      sc2.display("Nandan");
      sc3.display("Vamsi");
    System.out.println(sc1.myname +","+sc2.myname +","+sc3.myname);
  }
}
class subClass
{
    String msg="Hello ";
    String myname;
    void display(String name)
    {
        myname=name;
        System.out.println(msg + name);
    }
}
