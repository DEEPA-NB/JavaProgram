import java.util.Scanner;
class Mainclass1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Emp1[] e=null;
boolean r=false;
do
{
System.out.println("1.Create \n 2.Display \n 3.Raise Salary \n 4.Ext");
int i=sc.nextInt();
if(i==4) break;

switch(i)
{
case 1: System.out.println("Enter no. of employees you would like to create: ");
        int size=sc.nextInt();
        e=new Emp1[size];
        for(int k=0;k<e.length;k++)
        e[k]=new Emp1();
        for(int j=0;j<e.length;j++)
        e[j].create();
        r=true;
        break;
case 2: if(r) for(int j=0;j<e.length;j++)
        e[j].display();
        else System.out.println("No Records Found...");
        break;
case 3: if(r) for(int j=0;j<e.length;j++)
        e[j].RaiseSalary();
        else System.out.println("No Records Found...");
        break;
case 4: System.out.println("No Records Found..."); 
}
}
while(true);
}
}
