package ir.ateam.ucmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestAI {

    private int[][] Ele1 = {{1,2,8},{1,2,8},{4,8,-2},{8,4,1},{8,-6,9},{2,6,1},{6,-5,6},{3,2,9},{8,4,-3},{8,1,9},{7,-5,3},{1,7,3},{1,2,-1},{9,4,6},{2,9,-7},{2,1,4}};
    private int[][] Ele2 = {};
    private int[][] Ele3 = {};
    private int[][] Ele4 = {};
    private int[][] Ele5 = {};
    private int[][] Ele6 = {};
    private int[][] Ele7 = {};
    private int[][] Ele8 = {};
    


    private static int getRandom(int min, int max) {
        int spread = max - min;
        return new Random().nextInt(spread + 1) + min;
    }
}
