import java.util.LinkedList;
import java.util.List;
    // Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
    //By starting with 1 and 2, the first 10 terms will be:
    //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    //By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
    //find the sum of the even-valued terms.
public class EvenFib {
    public static void main(String[] args) {
        int limit = 4000000;
        int f1 = 1;
        int f2 = 2;
        int currentfnumb = 0 ;
        List<Integer> fibNumberList = new LinkedList<Integer>();
        fibNumberList.add(f1);
        fibNumberList.add(f2);

        while(fibNumberList.get(fibNumberList.size()-2) + fibNumberList.get(fibNumberList.size()-1) < limit){
            currentfnumb = fibNumberList.get(fibNumberList.size()-2) + fibNumberList.get(fibNumberList.size()-1);
            fibNumberList.add(currentfnumb);
        }
        int sumofevenfibnum=0;

        for(Integer i: fibNumberList){
            if((i % 2) == 0){
                sumofevenfibnum += i;
            }
        }

        System.out.printf("The sum of the even valued terms that do not exceed 4mill is:  %d\n", sumofevenfibnum);
    }
}
