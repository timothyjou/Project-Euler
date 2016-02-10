import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by timothyjou on 16-02-07.
 */
public class Largest_Palindrome {
    //A palindromic number reads the same both ways.
    //The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    //Find the largest palindrome made from the product of two 3-digit numbers.

    public static boolean isPalindrome(int input){
        String intString = String.valueOf(input);
        String palindrome = "";
        for(int i =intString.length()-1; i >-1;i--){
            palindrome += intString.charAt(i);
        }
        return intString.equals(palindrome);
    }

    public static boolean isFactor3digits(int input){
        for(int i = 999; i>99; i--){
            if(input%i==0 && is3digits(input/i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean is3digits(int input){
        String a = String.valueOf(input);
        if(a.length()==3){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int topBound = 999*999;
        int lowBound = 100*100;
        List<Integer> listOfPalin = new ArrayList<Integer>();
        for(int i = topBound; i > lowBound-1; i--){
            if(isPalindrome(i)){
                listOfPalin.add(i);
            }
        }
        int largestPalin = 0;
        for(int i = 0; i < listOfPalin.size()-1; i++){
            if(isFactor3digits(listOfPalin.get(i))){
                largestPalin = listOfPalin.get(i);
                break;
            }
        }
        System.out.printf("The largest palindrome made from the product of two 3-digit numbers is: %d\n",largestPalin);

    }
}
