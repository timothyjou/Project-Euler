/**
 * Created by timothyjou on 16-03-01.
 */
public class LongCollatz {
//    The following iterative sequence is defined for the set of positive integers:
//
//    n → n/2 (n is even)
//    n → 3n + 1 (n is odd)
//
//    Using the rule above and starting with 13, we generate the following sequence:
//
//            13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//    Which starting number, under one million, produces the longest chain?
//
//    NOTE: Once the chain starts the terms are allowed to go above one million.

    // this method takes about O(n^2) due to the nested loops
    public static void main(String[] args){
        int i = 2;
        int threshold = 1000000;
        int maxcounter = 0;
        int answer = 0;
        while (i < threshold){
            long temp = i;
            int counter = 1;
            while(temp!=1) {
                if (temp % 2 == 0) {
                    temp /= 2;
                } else {
                    temp = temp * 3 + 1;
                }
                counter++;
            }
            if(counter > maxcounter){
                answer = i;
                maxcounter = counter;
            }
            i++;
        }
        System.out.printf("the longest collatz sequence chain generated under 1 million is %d\n",answer);
    }
}
