import java.util.Scanner;
class Mainclass{
                public static void main(String[] args){
                Emp1 e=new Emp1();
                while(true){
                            Scanner sc=new Scanner(System.in);
                            System.out.println("1.Create \n 2.Display \n 3.Raise salary \n 4.Exit");
                            int i=sc.nextInt();
                                              if(i==4) break;
                                              switch(i){
                                                         case 1: e.create();
                                                                 break;
                                                         case 2: e.display();
                                                                 break;
                                                         case 3: e.RaiseSalary();
                                                         break;
                                                        }
                             }
                     }
}