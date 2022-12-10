import java.util.Scanner;

public class DueCalculator extends GetStudentData{

    int totalCost = 0;
    public void dueCalc(int credit){
        int totalCost = credit*5000;
        System.out.println("You due is: " +totalCost);

        this.totalCost = totalCost;
    }

    public void Pay(){
        System.out.println("You due is: " +totalCost);
        char option;
        Scanner scan =new Scanner(System.in);

        do{
            System.out.println("********************************************");
            System.out.println("Do you want to pay your due?");
            System.out.println("a) Yes");
            System.out.println("b) No");
            option=scan .next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'a':
                    System.out.println("Enter the amount you want to pay: ");
                    int pay = scan.nextInt();
                    this.totalCost -= pay;
                    System.out.println("Due left: " + totalCost);
                    break;
                case 'b':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option!");
                    break;
            }

        }while(option!='b');
    }


}
