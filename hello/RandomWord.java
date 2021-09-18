/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int wordCount = 0;

        while(!StdIn.isEmpty()) {
            wordCount++;
            String current = StdIn.readString();
            champion = StdRandom.bernoulli(1.0 / (double) wordCount) ? current : champion;
        }

        System.out.println(champion);
    }
}
