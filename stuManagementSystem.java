/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.database.systeem;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.*;   
import java.util.Scanner;
//Student database system

import java.util.Scanner;

import java.util.Scanner;

public class cls {
 String name,blood;
    int id,semister,phone;
    float CGPA;
    
    public void info()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();
        this.name = name;
        System.out.println("Enter Student Id no: ");
        int id = input.nextInt();
        this.id = id;
        System.out.println("Enter Semister: ");
        int semister = input.nextInt();
        this.semister  = semister;
        System.out.println("Enter Phone no: ");
        int phone = input.nextInt();
        this.phone = phone;
        System.out.println("Enter Blood group: ");
        String blood = input.next();
        this.blood = blood;
        
      
        
    }
   
    
    public static void intro(){

    
    System.out.println("\n");
    System.out.println("\n\t\t\t***********************************************");
    System.out.println("\n\t\t\t***********************************************");
    System.out.println("\n\t\t\t**                                           **");
    System.out.println("\n\t\t\t**          Student Database System          **");
    System.out.println("\n\t\t\t**                                           **");
    System.out.println("\n\t\t\t***********************************************");
    System.out.println("\n\t\t\t***********************************************");
    System.out.println("\n\t\t\t-----------------------------------------------\n");
}
    public static void submittedBy()
{
    System.out.println("\t\t\t\t\t\t\tSUBMITTED BY PAGE");
    System.out.println("\n\n\n");
    System.out.println("\n\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\n\t\t\t        =          Name                    ID         =");
    System.out.println("\n\t\t\t        =*********************************************=");
    System.out.println("\n\t\t\t        =    1. Mehedi Hasan Naim  ID: 212-15-14721   =");
    System.out.println("\n\t\t\t        =    2. Shafiul Islam      ID: 212-15-14716   =");
    System.out.println("\n\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\n\n\n\t\t\t Enter any key to continue.....");
     Scanner input = new Scanner(System.in);
    int p=input.nextInt();
    func();

}

public static void submittedTo()
{
    System.out.println("\t\t\t\t\t\t\tSUBMITTED TO PAGE");
    System.out.println("\n\n\n");
    System.out.println("\n\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\n\t\t\t        =     Ms. Afsara Tasneem Misha    =");
    System.out.println("\n\t\t\t        =*********************************=");
    System.out.println("\n\t\t\t        =    Lecturer                     =");
    System.out.println("\n\t\t\t        =    Dept. of CSE,                =");
    System.out.println("\n\t\t\t        =    DIU                          =");
    System.out.println("\n\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\n\n\n\t\t\t Enter any key to continue.....");
    Scanner input = new Scanner(System.in);
    int p=input.nextInt();
    func();

}


public static void func(){
    
     System.out.println("\t\t\t\t\tMAIN PROJECT");
    System.out.println("\n\n\n\t\t\t1.Submitted By");
    System.out.println("\n\t\t\t2.Submitted To");
    System.out.println("\n\t\t\t3.Main project");
    
Scanner input = new Scanner(System.in);
    System.out.println("\n\n\n\t\t\tEnter choice => ");
    int choice1=input.nextInt();
    
    switch (choice1)
    {
    case 1:
        submittedBy();
        break;
    case 2:
        submittedTo();
        break;
    case 3:
        project();
        break;
   
    default:
        System.out.println("\n\n\n\t\t\tWRONG CHOICE !!! Try again...");
    }
}

/*
public static void pro(){
    
     System.out.println("\t\t\t\t\tMAIN PROJECT");
    System.out.println("\n\n\n\t\t\t1.Student details");
    System.out.println("\n\t\t\t2.Result Calculator");
    
Scanner input = new Scanner(System.in);
    System.out.println("\n\n\n\t\t\tEnter choice => ");
    
    int choice1=input.nextInt();
    switch (choice1)
    {
    case 1:
        project();
        break;
    case 2:
        final_result_generator();
        break;
       
    default:
        System.out.println("\n\n\n\t\t\tWRONG CHOICE !!! Try again...");
    }
}

*/


public static float GPA_Calculator(float mark){
    
    if (mark >= 80){
        return 4;
    }
    else if (mark >= 75){
        return (float) 3.75;
    }
    else if (mark >= 70){
        return (float) 3.5;
    }
    else if (mark >= 65){
        return (float) 3.25;
    }
    else if (mark >= 60)
    {
        return 3;
    }
    else if (mark >= 55)
    {
        return (float) 2.75;
    }
    else if (mark >= 50)
    {
        return (float) 2.5;
    }
    else if (mark >= 45)
    {
        return 2;
    }
    else if (mark >= 40)
    {
        return (float) 1.5;
    }
    else return 0; 
}




public void final_result_generator()
{
    
    System.out.println("\t\t\t\t\tRESULT/GRADE GENERATOR PAGE");
 
            Scanner input = new Scanner(System.in);
            System.out.println("Obtained Marks of OOP:  ");
            float A = input.nextInt();
            
            System.out.println("Obtained Marks of OOP LAB:  ");
            float B = input.nextInt();
            System.out.println("Obtained Marks of ALGORITHM:  ");
            float C = input.nextInt();
            System.out.println("Obtained Marks of DIGITAL ELECCTRONICS:  ");
            float D = input.nextInt();
            System.out.println("Obtained Marks of ENGINEERING MATHEMETICS:  ");
            float E = input.nextInt();
            System.out.println("Obtained Marks of ALGORITHM LAB:  ");
            float F = input.nextInt();
             CGPA = (float) (((GPA_Calculator(A) * 2.0) + (GPA_Calculator(B) * 2) + (GPA_Calculator(C) * 2) + 
                           (GPA_Calculator(D) * 3) + (GPA_Calculator(E) * 2) + (GPA_Calculator(F) * 2)) / 13);  
          // System.out.println(""+CGPA);
 }


 public void display()
    {
        System.out.println("Name: "+name+"   Id: "+id+"    Semister: "+semister+"    Phone: "+phone+"    Blood: "+blood+"    CGPA: "+CGPA);
    }
 
    public void displaySrc()
    {
        System.out.println("Data Found In Database.\n");
        System.out.println("Name: "+name+"   Id: "+id+"    Semister: "+semister+"    Phone: "+phone+"    Blood: "+blood+"    CGPA: "+CGPA);
    }


public static void project(){
    
    System.out.println("Enter num of students: ");
            Scanner input = new Scanner(System.in);
            
        int n = input.nextInt();
        cls arr [] = new cls[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = new cls();
            arr[i].info();
            arr[i].final_result_generator();
        }
         
         System.out.println(""+arr.length);
        for(int i=0; i<n; i++)
        {
            arr[i].display();
        }
        
        
        for(;;){
            
        int idx=-1;
       System.out.println("Enter proper key to search: 1. Search by Id 2. Search by Phone no  3. Search by Blood group 4. Exit");
       int m = input.nextInt();
       
       if(m==1){
         System.out.println("Enter Student Id no to search: ");
        int idd = input.nextInt();
        for(int j=0; j<n; j++)
        {
            if(arr[j].id == idd)
            {
                idx = j;
            }
        }
                if(idx >= 0 && idx <n) arr[idx].displaySrc();
        else System.out.println("Not found.");
       }
       
       
       else if(m==2){
           
           System.out.println("Enter Student's Phone no to search: ");
        int phn = input.nextInt();
        for(int j=0; j<n; j++)
        {
            if(arr[j].phone == phn)
            {
                idx = j;
            }
        }
                if(idx >= 0 && idx <n) arr[idx].displaySrc();
        else System.out.println("Not found.");
       }
       
       
       
       else if(m==3){
           System.out.println("Enter Student's Blood group to search: ");
        String bld = input.next();
        for(int j=0; j<n; j++)
        {
            if(arr[j].blood.equals(bld))
            {
                idx = j;
            }
        }
                if(idx >= 0 && idx <n) arr[idx].displaySrc();
        else System.out.println("Not found.");
       }
       else break;
        }  
}


//main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        intro();
        func();
        
        
}
}
