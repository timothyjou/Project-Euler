import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by timothyjou on 16-02-09.
 */
public class SieveOfEros {
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
    //it's muc hfaster than brute force
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
        List<Integer> q = sieveOfEros(2000000);
        for(Integer i: q){
            System.out.printf("%d\n",i);
        }
    }
}
