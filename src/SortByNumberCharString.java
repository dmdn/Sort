import java.util.Scanner;


public class SortByNumberCharString extends Sorting implements Printing {

    String[] sortArr;

    @Override
    void arrSort(String[] args) {
        System.out.println("Serial numbers of lines of text:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(i);
            if (i < args.length) {
                System.out.print(" ");
            }

        }
        System.out.println("");

        System.out.print("Enter the line number to sort through a space: ");
        Scanner in = new Scanner(System.in);
        String order = in.nextLine();
        String[] orderArr = order.split(" ");



        for(String n : orderArr){

            try {
                Integer.parseInt(n);
            } catch (Exception e) {
                System.out.println("!!You have entered an incorrect line number");
                return;
            }

            if (Integer.valueOf(n) < 0 && Integer.valueOf(n) >= orderArr.length) {
                System.out.println("!You have entered an incorrect line number");
                return;
            }


        }

        sortArr = new String[orderArr.length];

        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = args[Integer.valueOf(orderArr[i])];
        }

    }

    @Override
    public void print() {
        System.out.println("-------------");
        for(String s : sortArr){
            System.out.println(s);
        }
    }

}
