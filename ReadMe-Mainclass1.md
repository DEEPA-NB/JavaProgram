EMPLOYEE DETAILS

Here I have written a code to create the employee details by giving 4 options like create,display,raisesalary and exit.

To select the option from the user side Scanner class is used with System.in

To display the 4 options I have written a println statment
        
    System.out.println("1.Create \n 2.Display \n 3.Raise Salary \n 4.Ext");
    
And then used switch case. Here 1 for create, 2 for display, 3 for raisesalary and 4 for exit.
Here case 1 is to enter the number of employees records that w are going to enter and then calling the create method using Employee object.And the I have taken one boolean variable r and initialized it with false. after entering the records we have to make r as true.

      for(int j=0;j<e.length;j++)
      e[j].create();
      r=true;
      
Case 2 is to display the employee details.Before display it must check wheather there is any record present or not. if not it will print no records found else it will display the entered employee details.If r is true it will display the employee details else if r is false it will diplay no records found as output.

      if(r) for(int j=0;j<e.length;j++)
      e[j].display();
      else System.out.println("No Records Found...");    

The same code is also written for RaiseSalary mothod in case 3. If any employee is present then we have to raise the salary for that employee else it will display no
records found. 

      if(r) for(int j=0;j<e.length;j++)
      e[j].RaiseSalary();
      else System.out.println("No Records Found...");
      
Else it will display no records found in case 4

      System.out.println("No Records Found..."); 
