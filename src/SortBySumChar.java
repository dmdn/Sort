
public class SortBySumChar extends Sorting implements Printing {

    String[] sortArr;

    @Override
    void arrSort(String[] args) {

        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args.length - 1 - i; j++){
                if(args[j].length() > args[j + 1].length()){
                    String str = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = str;
                }
            }
        }

        sortArr = args;

    }

    @Override
    public void print() {
        for(String s : sortArr){
            System.out.println(s);
        }
    }
}
