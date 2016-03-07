import java.util.ArrayList;
import java.util.List;

/**
 * Created by timothyjou on 15-10-07.
 */
//Project Euler_Problem 1_Multiples of 3 and 5
//If we list all the natural numbers below 10 that are multiples of 3 or 5,
// we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
public class multiples35 {
    // O(n)
    public static void main(String[] argsv){
        int upper = 1000;
        List<Integer> multiple3= new ArrayList<Integer>();
        List<Integer> multiple5= new ArrayList<Integer>();
        List<Integer> multiple15= new ArrayList<Integer>();
        for(int i = 1; i < upper; i++){
            if (i%3 ==0){
                multiple3.add(i);
            }
        }
        for(int i = 1; i < upper; i++){
            if (i%5 ==0){
                multiple5.add(i);
            }
        }
        for(int i = 1; i < upper; i++){
            if (i%15 ==0){
                multiple15.add(i);
            }
        }

        int multiplesof35 = sumOf(multiple3) + sumOf(multiple5)- sumOf(multiple15);

        System.out.printf("The sum of all the multiples of 3 or 5 below 1000 is:  %d \n",multiplesof35);


    }

    public static int sumOf(List<Integer> l){
        int sum = 0;
        for(int i = 0; i < l.size();i++){
            sum += l.get(i);
        }
        return sum;
    }
}
