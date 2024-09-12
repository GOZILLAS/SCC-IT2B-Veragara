
package vergarait2b.java;

import java.util.Scanner;

public class Management{
      
   public void getgetManagement(){
       
       Scanner sc = Scanner(System.in);
        Management [] mc = new  Management[100];
       
        System.out.println("Enter No. of Task:");
        int enums = sc.nextInt ();
        
        for(int i = 0; i < enums; i++){
            System.out.println("Enter detail of Task: " + (1 + 1));
            
            System.out.println("Task ID: ");
            int  id = sc.nexInt();
            
            System.out.println("Task Name");
            String name = sc.nextLine();
           
            System.out.println("Assigned To:");
            String assign = sc.nextLine();
            
            System.out.println("Due Date:");
            int ddate = sc.nextInt();
            
            System.out.println("Priority:");
            String prio = sc.nextLine();
            
            System.out.println("Status:");
            String stat = sc.nextline();
            
          
        }
        
        
        
        
       
       
       
       
       
       
       
       
       
       
       
       
       
   }
    
}
