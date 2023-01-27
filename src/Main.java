import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int isPresent = 0;
        int isAbsent =1;
        int dailySalary;
        int workHours;
        int salaryPerhours=20;
        int checkAttendence = (int)((Math.random()*10)%2);
        if (checkAttendence==isPresent){
            System.out.println("Employee is present");
            workHours=8;
        }
        else{
            System.out.println("Employee is Absent");
            workHours=0;
        }
        dailySalary=workHours*salaryPerhours;
        System.out.println("daily Salary is " + dailySalary);
    }
}