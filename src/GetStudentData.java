import java.util.ArrayList;
import java.util.Scanner;

public class GetStudentData extends StudentData{

    public String id;
    private String password;
    CourseEnroll courses;
    DueCalculator due;

    void setData(String id, String SName){
        this.id = id;
        this.SName =SName;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    void menu(){
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Welcome ");
        System.out.println(SName);
        System.out.println("SID: "+id);

        System.out.println("\n");


        do{
            System.out.println("********************************************");
            System.out.println("Choose an option");
            System.out.println("a) Check Result");
            System.out.println("b) Course Enroll");
            System.out.println("c) Due");
            System.out.println("d) Add Result");
            System.out.println("e) Remove Result");
            System.out.println("f) Exit");
            option=scan.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'a':
                    System.out.println("......................");
                    System.out.println("CGPA ="+ CGPA);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'b':
                    courses = new CourseEnroll(); // Aggregation

                    System.out.println("Enter Number of Courses you want to enroll for Spring 2023");
                    int n = scan.nextInt();
                    courses.EnrolledCourse(n);
                    System.out.println("\n");
                    System.out.println("Enrolled Courses:");
                    ArrayList<String> totalCourse = new ArrayList<String>();
                    totalCourse = courses.courseEnrolled;
                    for (int i = 0; i < totalCourse.size(); i++) {
                        System.out.println(courses.courseEnrolled.get(i));
                    }
                    int totalCredit = courses.totalCredit;
                    System.out.println("Total Credit: " + totalCredit);
                    System.out.println("\n");
                    break;



                case 'c':
                    System.out.println("......................");
                    System.out.println("Payment Management:");
                    System.out.println("......................");
                    try{
                        System.out.println("\n");

                        do{
                            System.out.println("********************************************");
                            System.out.println("Choose an option from Payment management");
                            System.out.println("a) Check Due");
                            System.out.println("b) Pay due");
                            System.out.println("c) Exit");
                            option=scan.next().charAt(0);
                            System.out.println("\n");

                            switch (option){
                                case 'a':
                                    due = new DueCalculator();
                                    due.dueCalc(courses.totalCredit);
                                    break;
                                case 'b':
                                    try{
                                        due.Pay();
                                    }catch(Exception e){
                                        System.out.println(e);
                                }
                                    break;
                                case 'c':
                                    System.out.println("......................");
                                    break;
                                default:
                                    System.out.println("Choose a correct option from payment menu to proceed");
                                    break;
                            }

                        }while(option!='c');

                    }catch(NullPointerException e){
                        System.out.println("Please try again after selecting your course!");
                    }
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Add Result:");

                    System.out.println("Enter your Student id");
                    String SID = scan.next();
                    System.out.println("Enter your Name");
                    String NewSName = scan.next();
                    System.out.println("Enter your CGPA");
                    String NewCGPA = scan.next();
                    studentId.add(SID);
                    studentCGPA.add(NewSName);
                    studentName.add(NewCGPA);

                    for (int i = 0; i < studentId.size(); i++) {
                        System.out.println(studentId.get(i));
                        System.out.println(studentName.get(i));
                        System.out.println(studentCGPA.get(i));
                    }
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'e':

                    System.out.println("Enter your Student id");
                    SID = scan.next();
                    studentName.remove(studentId.indexOf(SID));
                    studentCGPA.remove(studentId.indexOf(SID));
                    studentId.remove(SID);

                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'f':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option from Main menu to proceed");
                    break;
            }

        }while(option!='f');

        System.out.println("Thank you for using student management");
    }

    public boolean Authentication(String id){
        searchName(id);
        setData(id, SName);
        if(SName != null){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GetStudentData obj = new GetStudentData();
        System.out.println("\n");
        System.out.println("********************************************");
        System.out.println("        Welcome to Student Management       ");
        System.out.println("\n");
        System.out.println("Enter your Id and Password to access your student portal");
        System.out.print("Id: ");
        String id = scan.next();
        System.out.print("Password: ");
        obj.setPassword(scan.next());

        obj.Authentication(id);
        for(int i = 0; i < 2; i++){
            if(obj.Authentication(id) == true){
                obj.menu();
                break;
            }
            else{
                System.out.println("Student not found. Please correct your student id.");
                System.out.println("Enter your Id and Password to access your student portal");
                System.out.print("Id: ");
                id = scan.next();
                System.out.print("Password: ");
                obj.setPassword(scan.next());
                obj.searchName(id);
                obj.setData(id, obj.SName);
                obj.Authentication(id);
            }
            System.out.println("Too many try! Try again after sometime.");
        }



    }
}
