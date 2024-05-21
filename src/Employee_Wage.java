import java.sql.SQLOutput;

public class Employee_Wage {
    static int WAGE_PER_HOUR= 20;
    static int FULL_DAY_HOUR= 8;
   static double DAILY_EMP_WAGE=0;

    public static void main(String[] args) {
        System.out.println("welcome to Employee_Wage");
        int FULL_TIME= 1;

        double emp_check = Math.floor(Math.random()*10 % 2);
        if(FULL_TIME == emp_check)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is not present");
        double empcheck = Math.floor(Math.random()*10%2);

        if(empcheck == FULL_TIME){
            DAILY_EMP_WAGE = WAGE_PER_HOUR* FULL_DAY_HOUR;
        }

        System.out.println("Employee Daily Wage is : " + DAILY_EMP_WAGE);

    }
    }

