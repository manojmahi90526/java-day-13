import java.util.*;
class a{
    public void p1(){
        System.out.println("hello students");

    }
}
class b extends a{
    public void r(){
        System.out.println("hello teachers");

    }
}
class c extends b{
    public void r1()
    {
        System.out.println("hello professors");

    }
}
class multiple_inheritance{
    public static void main(String args[]){
        c h1=new c();
        h1.r();
        h1.r1();
        h1.p1();
    }
}