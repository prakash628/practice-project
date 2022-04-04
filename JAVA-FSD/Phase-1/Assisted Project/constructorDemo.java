package Assignment;

public class constructorDemo {
String name;
int rollNo;

public constructorDemo(String nav, int no)
{
this.name = nav;
this.rollNo = no;
}

public constructorDemo()
{
this.name = "Default";
this.rollNo = 3;
}

public static void main(String[] args) {
constructorDemo obj = new constructorDemo("Test",1);
System.out.println(obj.name+" "+obj.rollNo);
constructorDemo obj2 = new constructorDemo();
System.out.println(obj2.name+" "+obj2.rollNo);
}

}


