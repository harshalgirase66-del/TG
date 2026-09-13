class Greater 
{
    protected int a, b;

    public int findGreat(int a, int b)
    {
        this.a = a;
        this.b = b;

        if (a > b)
            return a;
        else
            return b;
    }

    public int findGreat(int a, int b, int c)
    {
        if (a > b && a > c)
        {
            return a;
        }
        else if (b > a && b > c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Greater obj = new Greater();

        System.out.println("Greater of two no: " + obj.findGreat(10, 7));
        System.out.println("Greater of three no: " + obj.findGreat(2, 6, 9));
    }
}
