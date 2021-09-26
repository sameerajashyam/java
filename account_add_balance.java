class account
{
double balance;
void addbalance(double value)
{
balance=balance+value;
}
double getbalance()
{
    return balance;
}
public static void main (String[] args)
{
account acc=new account();
acc.addbalance(1000);
acc.addbalance(acc.getbalance()*2);
System.out.println(acc.getbalance());
}
}
