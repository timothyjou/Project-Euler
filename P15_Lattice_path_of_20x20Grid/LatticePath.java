import java.util.ArrayList;
import java.util.List;

/**
 * Created by timothyjou on 16-03-01.
 */
// Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
// there are exactly 6 routes to the bottom right corner.
// How many such routes are there through a 20×20 grid?

// This function is O(n^2)
public class LatticePath {
    public static void main(String[] args){
        int grid = 20;
        List<Long> maxseq = new ArrayList<Long>();              //list of possibility of route at each intersection
        maxseq.add(1l); maxseq.add(1l);
        //this loop takes about O(n^2)
        for(int i =0 ; i< grid-1; i++){                         //loop for getting to the end of each width and height
            List<Long> temp = new ArrayList<Long>();
            temp.add(1l);
            for(int j = 0; j< maxseq.size()-1;j++){             //generate the next set of routes possibility
                temp.add(maxseq.get(j)+maxseq.get(j+1));
            }
            temp.add(1l);
            maxseq = temp;
        }

        //this loops takes about O(n^2)
        while(maxseq.size() != 1){                              //after getting to the midpoint (20x20), closes in
            List<Long> temp = new ArrayList<Long>();
            for(int j = 0; j< maxseq.size()-1;j++){             //add up the routes of possibility
                temp.add(maxseq.get(j)+maxseq.get(j+1));
            }
            maxseq = temp;
        }

        System.out.printf("There are %d possible routes in a 20x20 grid\n", maxseq.get(0));
    }
}
