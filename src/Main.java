import java.util.Scanner;



public class Main {
    static boolean exit = false;

    public static void main(String[] args) {

        do {
            doSorting(args);
        }
        while(exit = true);

    }

    private static void doSorting(String[] args) {
        System.out.println("-------------");
        System.out.println("Select the type of sorting - press:");
        System.out.println("1 - sorted by alphabet");
        System.out.println("2 - sorted by number of characters");
        System.out.println("3 - sorting by ordinal number in the string");
        System.out.println("-------------");
        Scanner in = new Scanner(System.in);
        int sortCase = in.nextInt();
        System.out.println("-------------");

        switch (sortCase) {
            case 1:
                SortByABC sortByABC = new SortByABC();
                sortByABC.arrSort(args);
                sortByABC.print();
                break;
            case 2:
                SortBySumChar sortBySumChar = new SortBySumChar();
                sortBySumChar.arrSort(args);
                sortBySumChar.print();
                break;
            case 3:
                SortByNumberCharString sortByNumberCharString = new SortByNumberCharString();
                sortByNumberCharString.arrSort(args);
                sortByNumberCharString.print();
                break;
            default:
                System.out.println("You enter a wrong number or a symbol (Enter 1, 2 or 3)");
                break;
        }
        System.out.println("-------------");


        System.out.println("You want to exit(y/n)?");
        Scanner inExit = new Scanner(System.in);
        String word = inExit.nextLine();

        if (word.equals("n")) {
            exit = false;
        } else if (word.equals("y")) {
            exit = true;
            System.exit(0);
        } else {
            System.out.println("You gave the wrong answer!");
        }

    }



}
