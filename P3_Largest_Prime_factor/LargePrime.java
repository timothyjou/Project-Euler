import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LargePrime {
    //The prime factors of 13195 are 5, 7, 13 and 29.
    //What is the largest prime factor of the number 600851475143 ?
    static long a = 600851475143l;
    public static boolean isPrime(int input){
        List<Integer> listOfFactor = new ArrayList<Integer>();
        for(int i = 1; i < input+1; i++){
            if(input%i ==0){
                listOfFactor.add(i);
            }
        }
        return (listOfFactor.size()==2);
    }

    //Sieve oF Eros that allows user to input a nubmer n and outputs a list of prime under that number
    //it's much faster than brute force
    public static List<Integer> sieveOfEros(int n){
        int[] a;
        a = new int[n-1];

        for(int i = 0; i< n-2; i++){
            a[i] = i+2;
        }

        int rootn = (int) Math.ceil(Math.sqrt(n));
        List<Integer> listOfrootnPrime = new LinkedList<Integer>();
        for(int i = 2; i<rootn +1; i++){
            if(isPrime(i)){
                listOfrootnPrime.add(i);
            }
        }

        for (Integer prime:listOfrootnPrime){
            for(int i = 0; i<a.length;i++){
                if (!(a[i]==prime)){
                    if(a[i]%prime == 0){
                        a[i] =0;
                    }
                }
            }}
        List<Integer> primesOfN = new LinkedList<Integer>();
        for(int i = 0; i<a.length; i++){
            if(!(a[i]==0)){
                primesOfN.add(a[i]);
            }
        }
        return primesOfN;
    }

    public static void main(String[] args){
        List<Integer> primesunderMaxInt = new LinkedList<Integer>();
        primesunderMaxInt = sieveOfEros(2000000);
        List<Integer> largestPrime = new LinkedList<Integer>();
        for(Integer i: primesunderMaxInt){
            if(a%i ==0){
                largestPrime.add(i);
            }
        }
        
        System.out.printf("largest prime is %d\n", Collections.max(largestPrime));
    }
}
