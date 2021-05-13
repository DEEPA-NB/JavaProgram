import java.util.Scanner;
class Emp1
{
String name;
int age;
double salary;
String job;
Scanner sc=new Scanner(System.in);
        void create()
         {
         System.out.println("Enter name :");
         this.name=sc.next();
         System.out.println("Enter Age :");
         this.age=sc.nextInt();
         System.out.println("Enter Salary :");
         this.salary=sc.nextDouble();
         System.out.println("Enter Designation :");
         this.job=sc.next();
         }
         void display()
         {
         System.out.println("Name: "+this.name+"\n Age :"+this.age+"\n Salary :"+this.salary+"\n Designation :"+this.job);
         }
         void RaiseSalary()
         {
         this.salary=salary+1000;
         System.out.println("salary Raised by 1000");
         }

}



