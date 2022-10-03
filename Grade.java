import java.util.Scanner;


public class Grade {
    public static void main (String[] args) {
        double score;
        String grade;

        System.out.println("Input Score");
        Scanner sa = new Scanner (System.in);
        score = sa.nextDouble();

        if (score >=80 && score <=100)
            grade = "A";
        else
            if (score >=70 && score <=79)  
            grade = "B";
            else
            if (score >=60 && score <=69)
            grade = "C";
            else
            if (score >=50 && score <=59)
            grade = "D";
            else 
            if (score >=0 && score <=49)
            grade = "E";
            else
            grade = "invalid score!";

    System.out.println ("Grade anda adalah : "+grade);

    }
}