import java.util.Scanner;
public class Emp
{
     public static void main(String[] args)
     {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of employees record you want to enter");
     int d=sc.nextInt();
     Employee[] e=new Employee[d];
     int ch=0,c2=0,i=0;
     do
      {
       System.out.println("\n1.Create");  
       System.out.println("2.Display");
       System.out.println("3.RaiseSalary");
       System.out.println("4.Exit");
       System.out.println("\nEnter Your Choice");
       ch=sc.nextInt();
       switch(ch)
             {
               case 1: do
                       {
                         System.out.println("\n1.Clerk");
                         System.out.println("2.Programmer");
                         System.out.println("3.Manager"); 
                         System.out.println("4.Exit");
                         System.out.println("\nEnter Your Choice");
                         c2=sc.nextInt();
                         switch(c2)
                               {
                                 case 1: e[i]=new Clerk();
                                         i++;
                                         break;
                                 case 2: e[i]=new Programmer();
                                         i++;
                                         break;
                                 case 3: e[i]=new Manager();
                                         i++;
                                         break;
                                 
                               }
                       }while(c2!=4);
                       break;
               case 2: try
                          {
                           for(Employee x:e)
                              {
                               int j=0;
                               do
                                 {
                                  for(j=0;j<e.length-1;j++)
                                   e[j].disp();
                                 }while(e[j]!=null);
                              }
                          }
                        catch(Exception ex)
                          {
                           System.out.println("No Records Present...");
                          }
                          break;
               case 3: try
                          {
                           for(Employee x:e)
                              {
                               int j=0;
                               do
                                 {
                                  for(j=0;j<e.length-1;j++)
                                   e[j].raise();
                                 }while(e[j]!=null);
                              }
                            System.out.println("Salary Raised....");
                          }
                        catch(Exception ex)
                          {
                           System.out.println("No Records Present...");
                          }
                          break;
                 case 4: System.out.println("\nExiting........");
                          break;
               default : System.out.println("\nInvalid Choice........");

             }
      }while(ch!=4);
}
}