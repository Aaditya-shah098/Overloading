class Test
{
    public void check(String msg)
    {
        System.out.println(msg);
    }
    public void check(int m)
    {
        System.out.println("square of"+m+"is"+m*m);
    }
    public double check(double a,double b)
    {
        return a+b;
    }
}
class Demo
{
    public static void main(String args[])
    {
        Test ob = new Test();
        ob.check("bishal is kid");
        ob.check(20);
        System.out.println(ob.check(20.5,5.6));
    }
}
    