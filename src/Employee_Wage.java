import java.sql.SQLOutput;
import java.sql.Wrapper;

public class Employee_Wage {

   static   int WAGE_PER_HOUR= 20;

    static int FULL_TIME_HOUR = 8;
   static int PART_TIME_HOUR=4;
   static int EMP_WORK_DAYS=2;
   static int FULL_TIME_EMP=1;
    static int PART_TIME_EMP=2;




    static double DAILY_EMP_WAGE=0;

    public static void main(String[] args) {
        int total_wage =0;
        int total_emp_work_hour=0;
        int EMP_WORK_HOUR=0;
        int total_emp_work_day=0;



        while(total_emp_work_hour<= EMP_WORK_HOUR && total_emp_work_day < EMP_WORK_DAYS ){
            total_emp_work_day++;
            int empcheck = (int) Math.floor(Math.random() * 10 % 3);

                if (empcheck == FULL_TIME_EMP) {
                    System.out.println("Employee are present for full time.");
                    DAILY_EMP_WAGE = FULL_TIME_HOUR * WAGE_PER_HOUR;
                } else if (empcheck == PART_TIME_EMP) {
                    System.out.println("Employee are present for part time.");
                    DAILY_EMP_WAGE = PART_TIME_HOUR * WAGE_PER_HOUR;
                } else {
                    System.out.println("Employee are not present");
                    DAILY_EMP_WAGE = 0;
                }
                total_wage += DAILY_EMP_WAGE;
                System.out.println("Employee Daily Wage is : " + DAILY_EMP_WAGE);
            }
            System.out.println("The Wages for a month is :" + total_wage);
        }
    }


