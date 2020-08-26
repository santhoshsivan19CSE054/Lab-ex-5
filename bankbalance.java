/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.Scanner;

/**
 *
 * @author user
 */

class Student
{
    String name;
    String roll;
    Student(String n, String r)
    {
        name=n;
        roll=r;
    }
    public String tostring()
    {
        return"Student name:"+name+"Student Roll No.:"+roll;
    }
}
class result
{
    int mark1,mark2,mark3;
    result(int m1,int m2,int m3)
    { 
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    
    void total()
    {
            int t;
            t=mark1+mark2+mark3;
            System.out.println("Marks of m1,m2,m3 are"+mark1+mark2+mark3);
            System.out.println("Total marks"+t);
            if(t>=120)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");           
            }
    }
}
class sports extends result
{
    
    int points;

    sports(int m1, int m2, int m3) {
        super(m1, m2, m3);
    }

    
    void calc()
    {
        super.total();
        
    }
}
public class test{
        public static void main(String[]args){
            Scanner obj = new Scanner(System.in);
            int j=3;
            int i=0;
            for(i=0;i<j;i++)
                {
                    System.out.println("Enter details of student"+(i+1));
                    System.out.println("Enter the name of the student"+(i+1));
                    String n=obj.next();
                    System.out.println("Enter the roll number");
                    String r = obj.next();
                    Student s = new Student(n,r);
                    System.out.println("Enter the m1 marks");
                    int m1=obj.nextInt();
                    System.out.println("Enter the m2 marks");
                    int m2=obj.nextInt();
                    System.out.println("Enter the m3 marks");
                    int m3=obj.nextInt();
                    result o = new result(m1,m2,m3);
                    System.out.println("Enter points in sports");
                    int p=obj.nextInt();
                    sports x = new sports(m1,m2,m3);
                    System.out.println("Displaying details of students"+(i+1));
                    System.out.println("Name and roll number of student"+(i+1));
                    System.out.println(s);
                    x.calc();
                    System.out.println("Points in sports"+p);

}


             
        
    }
}