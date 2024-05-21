import java.sql.SQLOutput;

public class Employee_Wage {

    static int FULL_TIME_EMP = 1;
    static int PART_TIME_EMP=2;
   static   int WAGE_PER_HOUR= 20;
    static int FULL_DAY_HOUR= 2;
    static int FULL_TIME_HOUR = 8;
   static int PART_TIME_HOUR=4;



    static double DAILY_EMP_WAGE=0;

    public static void main(String[] args) {
          int emp_hour=0;
        int daily_emp_wage=1;

        double empcheck = Math.floor(Math.random()*10%3);

        if(empcheck == FULL_TIME_EMP){
            System.out.println("Employee are present for full time.");
            daily_emp_wage = FULL_TIME_HOUR * WAGE_PER_HOUR;
        }
        else if (empcheck == PART_TIME_EMP) {
            System.out.println("Employee are present for part time.");
            daily_emp_wage = PART_TIME_HOUR * WAGE_PER_HOUR;
        }
        else{
            System.out.println("Employee are not present");
            daily_emp_wage=0;
        }

        System.out.println("Employee Daily Wage is : " + daily_emp_wage);




        System.out.println("Employee Daily Wage is : " + DAILY_EMP_WAGE);

    }
    }

