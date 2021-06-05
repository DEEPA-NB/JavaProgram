In this I hava created 2 files oneis Emp.java in which I have written all the business logics and the one is Employee.java which is having Mainclass to implement the business logics

Employee details by giving designation and salary.

Here I have created 5 classes employee, clerk, programmer, manager and emp

Employee class consist of logics for entering employee name and age dynamically

       public Employee()
       {
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Age");
        age=sc.nextInt();
       }

Clerk, Manager and programmer classes anr extends from employee class and these are final classes. Which are having the code for salary and raise salary. So that user can't change the salary
  
      public Clerk()
      {
        sal=8000;
        desig="Clerk";
       }
    public void raise()
       {
         sal+=1000;
        }
  
This is same for manager and programmer class also.

Emp1 class is the main class Here I have written the code to select the options according to theuser need and used switch case to select the clerk, programmer, manager options

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
                               
  And also used try catch block to handle all the exceptions.                             
