/*
public class Main
{
    public static void main (String asgs []) {
 // 1.For loop
        /*
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
        */

// 2.While loop
        /*
        int i=0;
        while (i<5)
        {
            System.out.println("Hello");
            i++;
        }
*/

 // 3.Do While loop
        /*
        int i=0;
        do
        {
            System.out.println("Hello");
            i++;
        }
        while (i<2);
*/

 //4.Arrays
       //ex 1
        /*
        int num[]=new int[3];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        System.out.println(num[0]);
    */
        //ex 2
        /*
      String name[]={"nimal","kamal","amal"};
      for(int i=0;i<name.length;i++)
      {
          System.out.println(name[i]);
      }
      */

        //ex 3
        /*
        int n[][]= {{1,2,3}, {3,4,5}, {6,7,8}};
        //System.out.println(n[1][0]);
        */

//5.Switch case
//ex 1
        /*
        int a=10;
        switch (a)
        {
            case 1:
                System.out.println("number= 1");
                break;

            case 10:
                System.out.println("number= 10");
                break;

            case 11:
                System.out.println("number= 11");
                break;
        }
*/

        //ex 2:
        /*
        String day = "monday";

        switch (day)
        {

            case "monday":
            case "tuesday":
            case "Wednsday":
            case "thursday":
            case "friday":
                System.out.println("School");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Class");
                break;
        }
    }
}
*/
//--------------------------------------------------------------
//6. non static
/*
class A
{
    String name;

    public void call()
    {
        System.out.println("call from "+name);
    }

    public static  void main(String args[])
    {
        A a=new A();
        a.name="Samsung";
        a.call();
    }
}
*/



//static
/*
class A
{
    static String name1,name2;

    static void call1()
    {
        System.out.println("call from "+name1);
    }

    static  void call2()
    {
        System.out.println("call from "+name2);
    }
    public static void main(String args[])
    {
        name1="Nokia";
        name2="Samsung";

        call1();
        call2();
    }
}
*/
//---------------------------------------------------------------------
//                         Factorial(kramaropitha)
/*
public class Main
{
   public static int factorial(int number)
     {
    if(number==0)
    {
        return 1;
    }
    else
    {
        return number*factorial(number-1);
    }
     }

     public static void main(String [] args)
     {
         int result= factorial(5);
         System.out.println(result);
     }
}
 */
//----------------------------------------------------------------------
//                       Variable length
//when we have lot of parameters for pass, we can use this method.
  /*
      public class Main
{
    public static void totalMarks(int... marks)
    {
        //1.print parameters as a list.

        for (int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        //2.get the total of the parameters.

        int totalmarks=0;
        for(int i=0;i<marks.length;i++)
        {
            totalmarks+= marks[i];
        }
        System.out.println(totalmarks);
    }

    public static void main(String [] args)
    {
        totalMarks(10,20,30);
    }
}
   */


//---------------------------------------------------------------------
//                        OOP METHODS
//  1.Encapsulation
/*
class A
{
 private String name;
 private int age;

 public void setName(String name)
 {
     this.name=name;
 }
 public String getName()
 {
     return name;
 }

 public void setAge(int age)
 {
     this.age=age;
 }
 public int getAge()
 {
     return age;
 }

 public static void main(String args[])
 {
     A a=new A();
     a.setName("Nimal");
     a.setAge(10);
     System.out.println("Name is:"+a.getName());
     System.out.println("Age is:"+a.getAge());
 }
}
*/
//----------------------------------------------------------------
//2. inheritance
/*
class A
{
    protected double bp,ht;

    public A(double bp, double ht)
    {
        this.bp=bp;
        this.ht=ht;
    }
}

class B extends A
{
    private double sl;

    public B(double bp,double ht, double sl)
    {
        super(bp,ht);
        this.sl=sl;
    }

    public static void main(String args[])
    {
        B b=new  B(100,10,20);
        System.out.println("bp="+b.bp);
        System.out.println("ht="+b.ht);
        System.out.println("sl="+b.sl);
    }
}
*/

