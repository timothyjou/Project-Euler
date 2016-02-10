/**
 * Created by timothyjou on 16-02-07.
 */
public class Sumsquarediff {
    //The sum of the squares of the first ten natural numbers is,
    //1^2+2^2...+10^2 = 385
    //The square of the sum of the first ten natural numbers is,
    //(1 + 2 + ... + 10)^2 = 55^2 = 3025
    //Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    //Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    public static void main(String[] args){
        int difference = 0;
        int sumOfSquares= 0;
        int sqaureOfSum = 0;
        for(int i = 1;i<101;i++){
            sumOfSquares += i*i;
            sqaureOfSum += i;
        }
        difference = sqaureOfSum*sqaureOfSum - sumOfSquares;
        System.out.printf("THe difference between the sum of the square and square of the sum of the first 100 number is: %d\n",difference);
    }
}
