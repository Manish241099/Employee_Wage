import java.sql.SQLOutput;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("welcome to Employee_Wage");
        int Full_Time = 1;

        double emp_check = Math.floor(Math.random()*10 % 2);
        if(Full_Time == emp_check)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is not present");
    }
    }

