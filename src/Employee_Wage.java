import java.sql.SQLOutput;

public class Employee_Wage {
    
   static   int WAGE_PER_HOUR= 20;

    static int FULL_TIME_HOUR = 8;
   static int PART_TIME_HOUR=4;



    static double DAILY_EMP_WAGE=0;

    public static void main(String[] args) {
        int empcheck = (int)Math.floor(Math.random()*10%3);

        switch (empcheck) {
            case 1:
                DAILY_EMP_WAGE = FULL_TIME_HOUR * WAGE_PER_HOUR;
                System.out.println("Employee are present for full time.");
                System.out.println("Employee Daily Wage is : " + DAILY_EMP_WAGE);
                break;

            case 2:
                DAILY_EMP_WAGE = PART_TIME_HOUR * WAGE_PER_HOUR;
                System.out.println("Employee are present for part time.");
                System.out.println("Employee wage is : "+DAILY_EMP_WAGE);
                break;

            default:
                System.out.println("Employee are not present");
                DAILY_EMP_WAGE=0;
                System.out.println("Employee Daily Wage is : " + DAILY_EMP_WAGE);
                break;


        }
    }
    }

