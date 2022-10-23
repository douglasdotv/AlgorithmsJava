package br.com.algorithms;

import java.util.Random;

public class TwoBalls {

     /*
     Given two crystal balls that will break if thrown from a floor number
     that is equal or greater than 'X' or remain intact if thrown from
     a floor number that is less than 'X', how do we find 'X' in the
     most optimized way?

     Instead of performing a linear search, we can walk sqrt(n) steps
     until the ball starts to break. Combining this with a linear search
     would land us a O(sqrt(n)) asymptotic running time.
     */

    public static int search(Boolean[] building) {
        int jump = (int) Math.floor(Math.sqrt(building.length)), i = jump;

        for (; i < building.length; i += jump) {
            if (building[i]) {
                break;
            }
        }

        i -= jump;

        for (int j = 0; j <= jump && i < building.length; ++j, ++i) {
            if (building[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int counter = 1;
        do {
            Random random = new Random();
            int totalFloors = random.nextInt(20, 100),
                    breakingPoint = totalFloors / random.nextInt(1, 10);

            Boolean[] building = new Boolean[totalFloors];
            for (int i = 0; i < breakingPoint; ++i) {
                building[i] = Boolean.FALSE;
            }
            for (int j = breakingPoint; j < totalFloors; ++j) {
                building[j] = Boolean.TRUE;
            }

            System.out.println("\nBuilding " + counter + ": ");
            for (int k = building.length - 1; k >= 0; --k) {
                System.out.println(k + " " + building[k]);
            }

            if (search(building) >= 0) {
                System.out.println("search(): the ball would break when thrown from floor " +
                        search(building) + " and up.");
            } else {
                System.out.println("search(): the ball never breaks no matter the floor.");
            }
        } while (++counter <= 10);
    }

}