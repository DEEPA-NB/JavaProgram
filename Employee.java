import java.util.Scanner;
abstract class Employee
{
  String name, desig;
  int age,sal;

  Scanner sc=new Scanner(System.in);
  
  public Employee()
  {
    System.out.println("Enter Name");
    name=sc.next();
    System.out.println("Enter Age");
    age=sc.nextInt();
  }
  public void disp()
  {
   System.out.println("\nName : "+name);
   System.out.println("Age : "+age);
   System.out.println("Salary : "+sal);
   System.out.println("Designation : "+desig);
   System.out.println("............................");
  }
  public abstract void raise();
}

final class Clerk extends Employee
{
  public Clerk()
  {
   sal=8000;
   desig="Clerk";
  }
  public void raise()
  {
   sal+=1000;
  }
}
final class Programmer extends Employee
{
  public Programmer()
  {
   sal=20000;
   desig="Programmer";
  }
  public void raise()
  {
   sal+=5000;
  }
}
final class Manager extends Employee
{
 public Manager()
 {
  sal=25000;
  desig="Manager";
 }
  public void raise()
  {
   sal+=7000;
  }
}




