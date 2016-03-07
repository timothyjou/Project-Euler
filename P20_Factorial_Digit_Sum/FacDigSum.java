import java.math.BigInteger;

/**
 * Created by timothyjou on 16-03-05.
 */
public class FacDigSum {
//    n! means n × (n − 1) × ... × 3 × 2 × 1
//
//    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
//    and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//    Find the sum of the digits in the number 100!
//
//   Solution is O(n)  n being the input size
public static void main(String[] args){
    int input = 100;
    //use the BigInteger class to hold the big value of 100!
    BigInteger start = BigInteger.valueOf(input);
    for(int i =1; i<input; i++){
        start = start.multiply(BigInteger.valueOf(input-i));
    }
    String result = start.toString();
    int answer = 0;
    for(int i = 0; i < result.length();i++){
        answer+= Character.getNumericValue(result.charAt(i));
    }
    System.out.printf("The Sum of the digits in the number 100! is %d\n",answer);

}

}
