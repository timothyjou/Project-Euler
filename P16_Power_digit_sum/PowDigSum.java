import java.math.BigInteger;

/**
 * Created by timothyjou on 16-03-05.
 */
public class PowDigSum {
//    2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//    What is the sum of the digits of the number 2^1000?
//
// Solution is O(n)
    public static void main(String[] args){
        BigInteger base = BigInteger.valueOf(2);
        // use of BigInteger Class in order to hold the larger number.
        BigInteger largenum = base.pow(1000);
        String answer = largenum.toString();
        int result = 0;
        for(int i =0; i<answer.length(); i++){
            result+= Character.getNumericValue(answer.charAt(i));
        }
        System.out.printf("The Sume of the digits of the number 2^1000 is %d\n",result);
    }
}
