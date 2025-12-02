class Calculator
{public int add (int n1,int n2)
{
    return n1+n2;
        }
}
class Adv extends Calculator
{
    public int add (int n1,int n2)
    {
        return n1+n2+3;
    }
}
class OverrideDemo
{
    public static void main(String args[])
    {
        Adv A = new Adv();
        int result=A.add(5,6);
        System.out.println("the sum is "+result);
        
        Calculator c =new Calculator();
        System.out.println("the parent class sum is"+c.add(5,10));
        
    }
}