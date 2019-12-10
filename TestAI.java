package ir.ateam.ucmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestAI {

    private int[][] Ele1 = {{1,2,8},{4,8,-2},{8,4,1},{8,-6,9},{2,6,1},{6,-5,6},{3,2,9},{8,4,-3},{8,1,9},{7,-5,3},{1,7,3},{1,2,-1},{9,4,6},{2,9,-7},{2,1,4},{9,-5,4},{9,1,9},{5,7,-2},{4,6,7},{8,-4,3},{6,3,2},{8,6,-8},{5,2,8},{5,-3,4},{2,3,5},{5,4,8},{4,-1,2},{5,6,9},{9,8,-5},{3,9,2},{4,8,-5},{3,6,7},{4,9,-3},{9,1,2},{9,-8,9},{3,2,-4},{4,7,1},{7,4,-7},{6,4,3},{9,8,-3},{6,8,6},{5,7,-3},{2,6,8},{5,2,-5},{5,1,2},{3,-3,8},{9,7,1},{6,5,-6},{2,4,5},{5,4,2},{4,-2,5},{5,6,8},{9,8,-2},{3,9,1},{4,8,-3},{3,9,3},{4,8,-1},{3,6,8},{4,9,-1},{9,1,3},{9,-2,9},{3,2,-3},{4,7,2},{7,4,-3},{6,4,2},{9,8,-4},{6,8,5},{5,7,-1},{2,6,2},{5,2,-1},{5,1,4},{3,-2,8},{9,7,8},{6,5,-4},{2,4,6},{5,4,3},{4,-3,2},{5,6,4},{9,8,-6},{3,9,4},{4,8,-4},{3,6,1},{4,9,-2},{9,1,4},{9,-3,9},{1,2,9},{3,2,-1},{4,7,4},{7,4,-2},{6,4,1},{9,8,-7},{6,8,1},{5,7,-6},{2,6,3},{5,2,-6},{5,1,5},{3,-1,8},{9,7,5},{6,5,-2},{2,4,1},{4,1,5},{2,-1,5},{1,4,5},{1,8,-2},{7,5,3},{6,9,-8},{4,2,3},{1,7,-2},{3,9,6},{4,3,-1},{5,9,6},{2,-1,6},{8,1,6},{6,4,-8},{1,6,1},{7,3,-4},{9,1,5},{1,5,-2},{3,4,1},{8,2,-9},{6,5,7},{5,1,-5},{6,8,9},{1,8,-1},{2,9,6},{2,8,-5}};
    private int[][] Ele2 = {{0,0,0}};
    private int[][] Ele3 = {{0,0,0}};
    private int[][] Ele4 = {{0,0,0}};
    private int[][] Ele5 = {{0,0,0}};
    private int[][] Ele6 = {{0,0,0}};
    private int[][] Ele7 = {{0,0,0}};
    private int[][] Ele8 = {{0,0,0}};

//    public List<Integer> Elementary() {
//        List<Integer> list = new ArrayList<>();
//        for (int x = 0; x < 8; x++) {
//            for (int i = 0; i < 25; i++) {
//                int sum = 0;
//                int minusplace1 = getRandom(1, numbers[x]);
//                int minusplace2 = getRandom(1, numbers[x]);
//
//                int minusplace3 = getRandom(1, numbers[x]);
//
//                for (int j = 0; j < numbers[x]; j++) {
//                    do {
//                        int rnd = getRandom(1, dnums[x]);
//                        sum += rnd;
//                        if (sum > 0)
//                            list.add(rnd);
//                        else
//                            sum -= rnd;
//                    } while (sum <= 0);
//                }
//            }
//        }
//        return list;
//    }

    public List<Integer> Elementary(){
        List<Integer> list = new ArrayList<>();




        return list;
    }

    private static int getRandom(int min, int max) {
        int spread = max - min;
        return new Random().nextInt(spread + 1) + min;
    }
}
