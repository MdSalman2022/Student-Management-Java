import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CourseEnroll {


    int totalCredit = 0;
    ArrayList<String> courseEnrolled = new ArrayList<String>();

    public CourseEnroll(){
        System.out.println("......................");
        System.out.println("Spring 2023 Courses :");
        System.out.println("- CSE214 - Algorithms - 2 Credit");
        System.out.println("- CSE215 - Algorithms Lab - 2 Credit");
        System.out.println("- CSE223 - Digital Electronics - 1 Credit");
        System.out.println("- CSE224 - Digital Electronics Lab - 2 Credit");
        System.out.println("- CSE225 - Data Communication - 3 Credit");
        System.out.println("- CSE226 - Software Project III - 1 Credit");
        System.out.println("- CSE231 - Microprocessor, Embedded System adn Iot - 1 Credit");
        System.out.println("- CSE232 - Microprocessor, Embedded System adn Iot Lab - 2 Credit");
        System.out.println("- CSE233 - Object Oriented Programming II - 1 Credit");
        System.out.println("- CSE234 - Object Oriented Programming II Lab - 2 Credit");
        System.out.println("- CSE235 - Numerical Methods - 3 Credit");
        System.out.println("- CSE236 - Math For Computer Science - 2 Credit");
        System.out.println("- CSE237 - Software Project IV - 1 Credit");
        System.out.println("......................");
    }

    public ArrayList<String> EnrolledCourse(int n){
        ArrayList<String> CourseList = new ArrayList<String>();
        CourseList.add("CSE214");
        CourseList.add("CSE215");
        CourseList.add("CSE223");
        CourseList.add("CSE224");
        CourseList.add("CSE225");
        CourseList.add("CSE226");
        CourseList.add("CSE231");
        CourseList.add("CSE232");
        CourseList.add("CSE233");
        CourseList.add("CSE234");
        CourseList.add("CSE235");
        CourseList.add("CSE236");
        CourseList.add("CSE237");

        int CSE214 = 2, CSE215 = 1, CSE223 = 1, CSE224=2,CSE225 = 3, CSE226 = 1, CSE231 = 1, CSE232 = 2, CSE233 = 1, CSE234 = 2, CSE235 = 3, CSE236 = 2,CSE237 = 1;
        ArrayList<Integer> CreditList = new ArrayList<Integer>();
            CreditList.add(2);
            CreditList.add(1);
            CreditList.add(1);
            CreditList.add(2);
            CreditList.add(3);
            CreditList.add(1);
            CreditList.add(1);
            CreditList.add(2);
            CreditList.add(1);
            CreditList.add(2);
            CreditList.add(3);
            CreditList.add(2);
            CreditList.add(1);



        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            int sl=i+1;
            System.out.println("Course No. " + sl + ":");
            String course = scan.next();
            if( CourseList.contains(course)){
                try{
                    totalCredit = totalCredit + CreditList.get(CourseList.indexOf(course));
                    courseEnrolled.add(course);

                }catch(Exception e){
                    System.out.println(e);
                }
            }
            else{
                System.out.println("Course did not match! Please Try again");
                break;
            }
        }

        System.out.println("Total Credit: " + totalCredit);
        return courseEnrolled;
    }


}
