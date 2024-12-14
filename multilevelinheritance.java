import  java.util.*;
class a
{
    public void p1()
    {
        System.out.println("Hello students");
    }
}
class b extends a
{
    public void r2()
    {
    System.out.println("Hello Teachers");
    }
}
class c extends b
{
    public void l()
    {
      System.out.println("Hello girls");  
    }
}
class Main
{
    public static void main(String args[])
    {
        c r=new c();
        r.p1();
        r.r2();
        r.l();
    }
}