//34. Create class Employee_Detail with attributes Employee_ID, Name, Designation, and Salary. Write a program to read the detail from user and print it. 

import java.util.*;
public class Employee_detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employee_id;
        System.out.println("Enter employee id ");
        employee_id=sc.nextInt();
        String name;
        System.out.println("Enter name  ");
        name=sc.next();
        int designation;
        System.out.println("Enter designation ");
        designation=sc.nextInt();
        int salary;
        System.out.println("Enter salary  ");
        salary=sc.nextInt();
        Employee_details d= new Employee_details();
        d.print();
        sc.close();

}
}
class Employee_details{
    int employeeid;
    String name;
    String designation;
    int salary;

    Employee_details( int employeeid,String name,String designation,int salary){
    this.employeeid=employeeid;
    this.name=name;
    this.designation=designation;
    this.salary=salary;

    }

public void print(){
    System.out.println("id is" + employeeid);
    System.out.println("namei is" +name);
    System.out.println("designation is" +designation);
    System.out.println("salary is" +salary);
    
}
}
