import java.util.LinkedList;
import java.util.List;

/**
 * Created by timothyjou on 16-02-09.
 */
public class Triplet {
    // A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    // a^2 + b^2 = c^2
    // For example, 32 + 42 = 9 + 16 = 25 = 52.
    // There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    // Find the product abc.

    // Euclid's formula:a^2+b^2=c^2
    // a = m^2-n^2     b = 2mn    c = m^2+n^2     GIVEN m >n
    //  a + b + c = 1000
    // n = 500/m - m

    public static void main (String[] args){
        double m = 1d;
        double n = 499d;
        List<Double> listOfM = new LinkedList<Double>();
        for(int i = 1; i < 1000; i++){
            if(m>n && Math.floor(n)==n){
                break;
            }else{
                m++;
                n = 500/m - m;
                listOfM.add(m);
            }
        }

        int x = (int) m;
        int y = (int) n;
        int a = x*x - y*y;
        int b = 2*x*y;
        int c = x*x+y*y;

        System.out.printf("m is %d, n is %d\n",x,y);
        System.out.printf("a is %d, b is %d, c is %d, sum of a+b+c is %d, product of a*b*c is %d\n",a,b,c,a+b+c,a*b*c);
    }
}

