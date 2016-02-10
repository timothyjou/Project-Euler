import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by timothyjou on 16-02-07.
 */
public class prime {
    //By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    //What is the 10 001st prime number?

    public static boolean isPrime(int input){
        List<Integer> listOfFactor = new ArrayList<Integer>();
        for(int i = 1; i < input+1; i++){
            if(input%i ==0){
                listOfFactor.add(i);
            }
        }
        return (listOfFactor.size()==2);
    }

    public static void main(String[] argsv){
        int primeOfInterest = 10001;
        List<Integer> listOfPrimes = new LinkedList<Integer>();
        int i = 2;
        while(listOfPrimes.size()<primeOfInterest){
            if(isPrime(i)){
                listOfPrimes.add(i);
            }
            i++;
        }
        System.out.printf("the %d th prime is %d\n",primeOfInterest,listOfPrimes.get(primeOfInterest-1));

    }


}
