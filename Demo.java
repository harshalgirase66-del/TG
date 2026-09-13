class parent {
     void average(int a, int b,int c)
    {
        int avg = (a + b + c) / 3;
        System.out.println("Average of three numbers is : " + avg);
    }

    void average(float a, float b,float c)
    {
        float avg = (a + b + c) / 3.0f;
        System.out.println("Average of three number is :" + avg);
    }
}
class Demo
{
    public static void main(String[] args)
    {
        parent obj = new parent();
        obj.average(10, 20, 30);
        obj.average(10.5f, 20.5f, 30.5f);
    }
}