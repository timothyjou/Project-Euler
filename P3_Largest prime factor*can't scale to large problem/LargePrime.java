
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import java.util.LinkedList;
import java.util.List;

public class LargePrime {

    //given a number what is its largest prime factor?
    public static void main(String[] args) {
        long givennumber = 13159;
        List<Long> factors = new LinkedList<Long>();
        for (long i = 1; i < givennumber; i++){
            if((givennumber%i)==0){ factors.add(i);
                System.out.println(i);
            }
        }
        long largestPrimFactor = 0;
        for(long l: factors){
            if(prime(l)){
                largestPrimFactor = l;
            }
        }
        System.out.println(largestPrimFactor);

    }

    private static boolean prime(long l) {
        List<Long> facotrsOfPrime = new LinkedList<Long>();
        for (long i = 1; i < l; i++){
            if((l%i)==0){ facotrsOfPrime.add(i);
            }
        }
        if (facotrsOfPrime.size()==1){
            return true;
        } else {
            return false;
        }
    }
}
