class sample 
{
	static int a=1;
	void add(int num)
	{
		a=a+num;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		sample n1=new sample();
		n1.add(10);
		sample n2=new sample();
		n2.add(20);
		System.out.println(n1.a);
		System.out.println(n2.a);
	}

}
