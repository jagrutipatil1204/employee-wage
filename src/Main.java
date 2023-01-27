import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int isPresent = 0;
        int isAbsent =1;
        int checkAttendence = (int)((Math.random()*10)%2);
        if (checkAttendence==isPresent){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}