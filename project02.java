import java.util.Scanner;

public class project02 {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("\u263AWELCOME TO COFFEE CAFE \u2675");
        System.out.println("********************");
        System.out.println("Chose you choice : ");
        System.out.println("1. Espresso -\u20B9200Rs");
        System.out.println("2. Cappucci -\u20B9250Rs");
        System.out.println("3. latte    -\u20B9300Rs");
        System.out.println("\nENTER YOUR CHOICE : ");
        Scanner sc=new Scanner(System.in);
        int choice= sc.nextInt();
        double bill=0;
        if(choice==1){
            bill+=200;
        } else if (choice==2) {
            bill+=250;
        } else if (choice==3) {
            bill=300;
        }else {
            System.out.println("invalid choice");
        }
        if (bill>0 ) {
            System.out.println("Add Whiped Cream for 30Rs.?(Yes /no)");
            int creame = sc.nextInt();
            if (creame == 1) {
                bill += 30;
            }

            System.out.println("Want  flavourshot ?(Enter 1 for vanila&2 for Choclate)");
            int favour = sc.nextInt();
            if (favour == 1) {
                System.out.println("Enter 1 for Vanila& 2 for choclate");
                int fchoice = sc.nextInt();
                if (fchoice == 1) {
                    bill += 20;
                } else if (fchoice == 2) {
                    bill += 30;
                } else {
                    System.out.println("Please follow menu");
                }
            }
        }
        System.out.println("Total bill is : "+bill);
    }
}
