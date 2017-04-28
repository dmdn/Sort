import java.util.Arrays;


public class SortByABC extends Sorting implements Printing {
    String[] sortArr;

    @Override
    void arrSort(String[] args) {
        Arrays.sort(args, String.CASE_INSENSITIVE_ORDER);
        sortArr = args;
    }

    @Override
    public void print() {
        for(String s : sortArr){
            System.out.println(s);
        }
    }
}
