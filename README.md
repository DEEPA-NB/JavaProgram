# JavaProgram to update and get the Employee details
There are 2 classes one is Emp1 class and the other one is Mainclass.

The Emp1 class has all the buisness logics and Mainclass contains the real entity.

 In theEmp1 class I have given the date members like name, age, salary and designation like 
 
String name;

int age;

double salary;

String job;
 
 
 To give the inputs from the user end we have used Scanner class.
 
 Scanner sc = new Scanner(System.in);
 
 These data members are required to create the methods like Create,Display, RaiseSalary and Exit from the page like,
 
 create method can be defined as:
 
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
         
   To display the entered data i have written this display method as:
   
         void display()
         {
         System.out.println("Name: "+this.name+"\n Age :"+this.age+"\n Salary :"+this.salary+"\n Designation :"+this.job);
         }
         
To raise the salary i have written RaiseSalary method and defind as:
         
         void RaiseSalary()
         {
         this.salary=salary+1000;
         System.out.println("salary Raised by 1000");
         }
 
In the create method inputs are given by the user, after creating the user details they can be read by using Display method, If we want to Raise the salary of theemployee then we have to call the raisesalary mothod and if we want to exit from the program then we have to call Exit mathod.

To call these four mothods i have used switch case inthe Mainclass and used key 1 for Create, 2 for Display, 3 for Raise Salary and 4 for Exit

if(i==4) break;

switch(i){

         case 1: e.create();
                  
                  break;
                  
         case 2: e.display();
                 
                 break;
                 
         case 3: e.RaiseSalary();
         
                 break;

In the main class I have created the object of the Emp1 class and call the methods.

After execution it ask for enter the key, if we enter key as 1 then it will ask to enter the employee name, age, salary and designation. If we enter the key as 2 then it will show all the entered entities, If we press the key 3 then it will raise the salary and updates the previous salary it can be check again by pressing 2 and finally if we want to exit from the program then we have to press 4.


