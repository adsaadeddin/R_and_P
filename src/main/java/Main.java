import java.util.Scanner;

public class Main {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;
        boolean keepRunning = true;

        while (keepRunning) {

            System.out.println("Please Choose your next Command : ");

            System.out.println(" 0_ print the head card \n 1_print A random Card \n 2_print the last card \n 3_Shuffle again! \n 4_deal All Cards! \n Any other key will exit the program");


            try {
                choice = in.nextInt();
            } catch (Exception e){
                break;
            }


            switch (choice) {

                case 0:
                    System.out.println(deck.dealTheHeadCard());
                    break;
                case 1:
                    System.out.println(deck.dealARandomCard());
                    break;
                case 2:
                    System.out.println(deck.dealTheTailCard());
                    break;
                case 3:
                    deck.shuffleCards();
                    break;
                case 4:
                    deck.dealAllCards();
                    break;
                default:
                    keepRunning = false;

            }

        }
    }
}
