import java.util.Scanner;

public class project02usingswitch {
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
        bill=switch (choice){
            case 1 ->bill+=200;
            case 2->bill+=250;
            case 3->bill+=300;
            default -> {
                System.out.println("invalid choice");
                yield -1;
            }
        };
        if (bill>0 ) {
            System.out.println("Add Whiped Cream for 30Rs.?(Yes /no)");
            int creame = sc.nextInt();
            if (creame == 1) {
                bill += 30;
            }

            System.out.println("Want  flavourshot ?(yes=1 & no =0) ");
            int favour = sc.nextInt();
            if (favour == 1) {
                System.out.println("Enter 1 for Vanila& 2 for choclate");
                int fchoice = sc.nextInt();
                bill=switch (fchoice){
                    case 1->{
                        bill+=20;
                        yield bill;
                    }
                    case 2->{
                        bill+=30;
                        yield bill;
                    }
                    default -> {
                        System.out.println("Invalid choice");
                        yield bill;
                    }
                };
            }
            System.out.println("Total bill is : "+bill);
        }
    }
}
