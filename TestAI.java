package ir.ateam.ucmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestAI {

    private int[][] Ele1 = {{1,2,8},{4,8,-2},{8,4,1},{8,-6,9},{2,6,1},{6,-5,6},{3,2,9},{8,4,-3},{8,1,9},{7,-5,3},{1,7,3},{1,2,-1},{9,4,6},{2,9,-7},{2,1,4},{9,-5,4},{9,1,9},{5,7,-2},{4,6,7},{8,-4,3},{6,3,2},{8,6,-8},{5,2,8},{5,-3,4},{2,3,5},{5,4,8},{4,-1,2},{5,6,9},{9,8,-5},{3,9,2},{4,8,-5},{3,6,7},{4,9,-3},{9,1,2},{9,-8,9},{3,2,-4},{4,7,1},{7,4,-7},{6,4,3},{9,8,-3},{6,8,6},{5,7,-3},{2,6,8},{5,2,-5},{5,1,2},{3,-3,8},{9,7,1},{6,5,-6},{2,4,5},{5,4,2},{4,-2,5},{5,6,8},{9,8,-2},{3,9,1},{4,8,-3},{3,9,3},{4,8,-1},{3,6,8},{4,9,-1},{9,1,3},{9,-2,9},{3,2,-3},{4,7,2},{7,4,-3},{6,4,2},{9,8,-4},{6,8,5},{5,7,-1},{2,6,2},{5,2,-1},{5,1,4},{3,-2,8},{9,7,8},{6,5,-4},{2,4,6},{5,4,3},{4,-3,2},{5,6,4},{9,8,-6},{3,9,4},{4,8,-4},{3,6,1},{4,9,-2},{9,1,4},{9,-3,9},{1,2,9},{3,2,-1},{4,7,4},{7,4,-2},{6,4,1},{9,8,-7},{6,8,1},{5,7,-6},{2,6,3},{5,2,-6},{5,1,5},{3,-1,8},{9,7,5},{6,5,-2},{2,4,1},{4,1,5},{2,-1,5},{1,4,5},{1,8,-2},{7,5,3},{6,9,-8},{4,2,3},{1,7,-2},{3,9,6},{4,3,-1},{5,9,6},{2,-1,6},{8,1,6},{6,4,-8},{1,6,1},{7,3,-4},{9,1,5},{1,5,-2},{3,4,1},{8,2,-9},{6,5,7},{5,1,-5},{6,8,9},{1,8,-1},{2,9,6},{2,8,-5}};
    private int[][] Ele2 = {{7,2,1,6},{8,2,7,-2},{8,1,8,1},{1,6,-4,3},{8,3,4,1},{7,-1,7,5},{8,1,4,6},{3,4,-3,7},{2,7,5,2},{9,6,-3,6},{4,3,7,5},{8,6,-7,4},{9,3,1,2},{1,6,7,-8},{6,7,8,2},{9,-4,1,2},{9,4,9,4},{1,6,3,-6},{6,4,5,6},{9,3,-6,1},{8,9,4,7},{3,4,-3,2},{3,2,1,5},{7,9,4,-1},{1,8,7,8},{6,1,-3,8},{2,4,7,2},{5,1,4,-3},{7,2,5,1},{3,8,-4,8},{4,3,5,1},{2,8,4,-6},{9,4,5,1},{8,6,-8,2},{9,2,1,5},{6,-3,1,5},{2,7,9,8},{1,9,-1,3},{1,3,3,2},{3,9,3,-7},{7,9,8,1},{9,-8,2,8},{8,3,7,4},{4,2,6,-1},{7,5,9,5},{5,9,-5,3},{6,5,2,3},{1,2,5,-8},{5,3,1,2},{5,1,-2,8},{2,3,6,2},{2,1,5,-3},{7,2,6,1},{3,4,-4,8},{4,3,2,1},{2,8,2,-7},{8,4,5,3},{8,6,-7,9},{9,7,1,8},{4,-3,4,5},{1,7,8,8},{1,7,-1,4},{1,7,1,2},{3,9,5,-7},{7,9,7,2},{9,-4,9,8},{8,3,6,3},{7,2,6,-1},{7,6,8,5},{5,8,-1,3},{6,5,4,3},{1,2,7,-8},{6,3,4,2},{6,1,-2,8},{2,3,7,2},{5,1,5,-3},{7,2,4,1},{3,6,-4,8},{4,3,4,1},{2,8,4,-7},{9,4,5,3},{8,6,-8,9},{9,7,1,5},{6,-3,4,5},{1,7,9,8},{1,9,-1,4},{1,7,3,2},{3,9,4,-7},{7,9,8,2},{9,-8,9,8},{8,3,7,3},{9,2,6,-1},{7,6,9,5},{5,9,-1,3},{6,5,6,3},{1,2,6,-8},{5,3,4,2},{2,6,2,-9},{6,9,6,5},{6,9,6,-7},{7,1,2,8},{9,7,8,-9},{1,3,6,3},{6,9,8,-7},{4,7,1,9},{5,-2,9,6},{6,9,2,9},{9,3,4,-2},{8,1,2,1},{8,-4,7,9},{6,8,4,5},{3,2,9,-3},{2,4,3,5},{7,1,-2,8},{3,1,8,3},{7,-2,3,5},{3,6,1,7},{1,9,-6,7},{1,8,7,2},{1,6,3,-1},{2,8,7,9},{8,2,-1,3},{8,2,8,3},{8,-2,9,3},{3,4,5,1},{1,9,-4,7}};
    private int[][] Ele3 = {{8,1,7,53,1},{21,-2,9,1,-8},{5,91,5,4,7},{1,86,-2,5,-3},{65,4,7,5,2},{7,9,-1,67,-4},{15,8,3,1,6},{3,-2,6,-1,59},{44,1,2,8,3},{7,5,-6,95,-3},{5,4,64,7,5},{97,-4,6,-1,2},{8,3,40,1,9},{4,-1,3,63,-9},{9,1,3,49,4},{1,33,-5,3,-2},{10,8,6,5,3},{6,4,-7,90,-9},{8,3,73,2,3},{1,9,-7,40,-8},{7,66,8,3,7},{26,3,-8,5,-9},{1,3,7,57,7},{57,-6,3,7,-6},{31,5,8,9,1},{51,2,-3,5,-8},{6,7,63,9,6},{28,9,-5,1,-9},{8,1,3,92,5},{89,4,-6,8,-4},{4,31,8,3,5},{54,-8,6,-5,4},{4,9,4,3,27},{4,-1,94,5,-7},{6,34,4,3,8},{6,-2,13,2,-8},{2,8,7,5,94},{4,58,-7,4,-5},{3,89,4,7,1},{91,-8,4,-2,9},{1,3,2,4,26},{76,-1,9,-1,8},{5,-2,6,8,-13},{3,2,3,9,56},{45,-9,6,-3,5},{2,4,7,3,57},{3,-1,22,-4,3},{3,4,2,12,4},{30,-8,5,2,-5},{7,1,65,6,3},{5,1,-2,42,-5},{6,7,64,9,7},{27,9,-2,1,-9},{8,7,4,92,5},{87,4,-6,8,-3},{3,31,8,3,8},{54,-8,3,-5,4},{4,9,5,3,37},{4,-1,94,5,-3},{6,44,4,5,8},{6,-3,13,2,-8},{2,9,7,5,93},{4,56,-7,4,-4},{3,99,5,7,1},{91,-7,4,-2,8},{1,4,2,5,26},{76,-1,9,-3,7},{8,9,91,1,7},{5,-2,6,7,-12},{3,2,3,8,66},{45,-9,6,-3,7},{2,4,7,5,57},{3,-2,22,-4,5},{3,4,2,10,3},{30,-8,5,2,-3},{7,1,65,7,3},{51,-9,-8,3,1},{6,7,64,9,6},{28,9,-2,1,-9},{8,7,3,92,5},{89,4,-6,8,-3},{4,31,8,3,8},{54,-8,4,-5,4},{4,9,4,3,37},{4,-1,94,5,-2},{6,44,4,3,8},{6,-2,13,2,-9},{2,9,7,5,94},{4,56,-7,4,-5},{3,99,4,7,1},{91,-7,4,-2,9},{1,4,2,4,26},{76,-1,9,-3,8},{8,9,91,1,8},{5,-2,6,7,-13},{3,2,3,9,66},{45,-9,6,-3,6},{2,4,7,4,57},{3,-2,22,-4,3},{3,4,2,10,4},{30,-8,5,2,-4},{7,1,66,6,3},{5,52,-8,-7,3},{96,5,6,7,9},{4,-1,63,9,-2},{5,1,5,45,9},{4,9,-6,81,-3},{1,4,5,79,1},{60,-9,8,7,-6},{46,8,6,9,2},{87,-3,9,-4,9},{1,4,53,5,4},{50,-8,6,5,-4},{31,3,8,4,8},{9,-1,50,8,-6},{9,5,8,99,1},{77,-4,9,5,-3},{79,7,9,2,1},{53,9,-5,2,-4},{58,5,3,8,3},{8,-3,7,-5,73},{9,6,1,85,7},{95,-4,3,-9,4},{8,53,1,4,6},{7,-5,4,80,-1},{9,4,91,8,3},{7,-4,97,-7,9},{4,6,8,2,37},{7,-5,85,-3,5}};
    private int[][] Ele4 = {{5,6,9,42,8},{5,68,-1,8,-2},{4,32,8,6,9},{7,-4,6,-8,39},{9,1,82,1,5},{98,-9,4,5,-9},{8,5,3,27,6},{6,-4,79,2,-9},{20,8,4,2,4},{91,3,-1,2,-6},{1,6,9,32,5},{8,-5,53,-8,6},{3,92,5,1,5},{73,-3,5,-7,6},{3,92,5,1,4},{73,-3,5,-8,6},{7,1,84,4,8},{30,5,-6,2,-4},{7,6,4,39,9},{4,-3,85,-4,5},{6,5,27,4,8},{21,-8,6,3,-5},{1,7,5,1,61},{13,-7,4,-7,4},{7,92,2,4,6},{2,-1,3,34,-2},{32,4,6,4,7},{22,-5,2,8,-9},{9,3,15,6,7},{9,49,-7,4,-6},{4,8,6,7,27},{7,-2,27,5,-6},{7,75,2,6,3},{40,-9,1,3,-2},{95,6,4,8,3},{14,-8,6,-7,9},{5,51,1,4,6},{92,-5,6,3,-9},{2,42,5,8,7},{54,2,-6,9,-1},{8,66,7,3,7},{8,-5,78,-4,5},{3,5,1,6,95},{38,-9,3,6,-3},{4,3,89,5,9},{8,-5,3,96,-6},{6,1,6,7,71},{5,-3,19,3,-1},{6,16,7,6,9},{9,-7,88,-3,7},{18,8,7,8,8},{6,82,-4,9,-1},{5,16,8,6,4},{10,-7,5,-2,9},{9,3,15,6,5},{9,79,-6,4,-6},{1,8,6,7,24},{5,-2,27,5,-7},{7,71,2,6,4},{40,-9,2,3,-1},{95,6,4,5,2},{10,-8,6,-5,9},{5,61,1,5,6},{92,-4,6,5,-9},{2,42,6,4,7},{52,2,-6,8,-1},{8,66,7,6,7},{8,-5,28,-4,8},{3,5,1,5,96},{38,-9,2,7,-3},{4,3,96,5,9},{8,-3,3,95,-6},{6,1,6,9,81},{5,-1,19,2,-1},{6,16,8,7,9},{9,-7,58,-2,7},{18,8,7,6,7},{6,83,-3,9,-1},{5,16,4,6,5},{58,-7,1,5,-8},{9,3,15,6,8},{9,79,-7,4,-6},{1,8,6,7,27},{5,-2,27,5,-6},{7,71,2,6,3},{40,-9,1,3,-1},{95,6,4,8,2},{10,-8,6,-7,9},{5,61,1,4,6},{92,-5,6,5,-9},{2,42,6,8,7},{52,2,-6,5,-9},{2,42,6,9,7},{52,2,-6,9,-1},{8,66,7,5,7},{8,-5,78,-4,8},{3,5,1,6,96},{38,-9,3,7,-3},{4,3,99,5,9},{8,-5,3,95,-6},{6,1,6,9,71},{5,-1,19,3,-1},{6,16,8,6,9},{9,-7,88,-2,7},{18,8,7,6,8},{6,83,-4,9,-1},{5,16,8,6,5},{9,-3,61,-8,5},{9,69,8,1,7},{4,6,-5,55,-6},{79,2,8,6,8},{6,-1,5,63,-6},{8,4,7,1,18},{58,-9,1,5,-7},{8,46,7,2,4},{20,-7,3,-4,6},{7,5,7,61,1},{51,-1,7,6,-5},{9,1,26,8,9},{85,2,-6,4,-8},{18,6,4,1,3},{8,3,-1,9,-6},{2,1,7,87,4},{87,-3,2,7,-4},{8,61,3,4,7},{3,-1,99,2,-9},{1,8,6,7,76},{31,-3,4,1,-3},{6,14,2,4,1},{8,-5,64,-5,6},{3,94,8,6,8},{5,-3,8,35,-7},{8,2,14,1,5},{8,-6,61,-2,8}};
    private int[][] Ele5 = {{2,5,7,6,4,63},{37,5,-2,6,-3,9},{3,98,6,3,6,7},{2,5,92,-3,5,-8},{7,9,60,3,4,1},{8,-4,29,3,-5,1},{61,4,8,9,8,7},{8,-3,1,-2,3,21},{7,8,2,34,8,1},{2,46,-9,1,-5,1},{5,8,4,2,93,5},{9,4,3,-2,71,-1},{2,13,8,5,6,7},{8,-2,7,1,16,-4},{50,1,5,3,7,1},{3,7,-2,84,2,-9},{82,2,4,1,2,8},{7,-5,4,8,32,-3},{41,2,1,3,5,2},{75,5,-1,2,-8,3},{2,9,90,5,2,3},{5,68,-7,4,7,-9},{4,56,4,6,4,1},{51,7,9,-2,6,-8},{6,4,2,4,20,9},{3,7,-5,56,-8,5},{2,8,7,2,4,59},{5,6,-3,1,-9,86},{9,5,8,96,7,2},{6,16,-8,3,-5,6},{5,9,7,1,14,5},{3,6,41,-5,4,-7},{8,2,9,2,80,7},{8,-5,39,5,7,-7},{1,15,8,5,5,1},{72,3,-6,2,9,-4},{4,73,4,6,7,5},{1,63,-6,4,4,-3},{5,40,7,7,2,6},{45,4,-1,6,4,-3},{9,6,70,7,1,7},{5,-4,6,75,8,-3},{58,4,4,2,8,9},{53,-6,5,4,7,-6},{9,5,6,40,7,9},{7,-1,42,4,-6,1},{6,8,5,8,46,3},{31,4,7,-6,4,-1},{1,8,81,6,8,2},{6,-4,7,6,23,-5},{2,5,2,7,1,48},{6,15,-5,3,-8,6},{2,8,7,1,4,58},{5,7,-3,1,-9,87},{9,5,8,85,7,2},{6,15,-8,3,-5,7},{5,9,7,1,17,5},{3,2,41,-5,4,-6},{8,2,9,1,90,7},{8,-4,39,5,7,-8},{1,16,8,5,6,1},{73,3,-6,2,8,-4},{4,73,5,6,7,5},{3,63,-6,4,5,-3},{5,30,6,7,2,6},{75,4,-1,6,7,-3},{5,44,6,7,2,6},{35,4,-1,6,4,-3},{9,6,75,7,1,7},{5,-4,6,71,8,-3},{58,5,3,2,8,9},{63,-6,5,4,7,-6},{9,5,6,31,7,9},{7,-1,42,4,-3,1},{6,7,6,8,46,3},{61,4,7,-6,4,-1},{1,8,80,6,8,3},{6,-4,7,6,23,-4},{2,7,2,3,1,48},{6,16,-5,8,-3,8},{2,8,7,1,4,59},{5,7,-3,1,-9,86},{9,5,8,95,7,2},{6,16,-8,3,-5,7},{5,9,7,1,15,5},{3,2,41,-5,4,-7},{8,2,9,2,90,7},{8,-5,39,5,7,-8},{1,15,8,5,6,1},{73,3,-6,2,9,-4},{4,74,5,6,7,5},{1,63,-6,4,5,-3},{5,40,6,7,2,6},{75,4,-1,6,4,-3},{9,6,74,7,1,7},{5,-4,6,71,9,-3},{58,4,3,2,8,9},{83,-6,5,4,7,-6},{9,5,6,41,7,9},{7,-1,42,4,-5,1},{6,8,6,8,46,3},{81,4,7,-6,4,-1},{1,8,80,6,8,2},{6,-4,7,6,23,-2},{2,5,2,3,1,48},{5,7,-8,5,-2,58},{6,8,4,1,9,54},{9,81,7,-6,5,-7},{5,2,3,39,6,9},{5,6,-5,11,-7,4},{2,7,4,8,76,5},{6,-1,34,-7,8,3},{74,5,7,3,8,2},{67,-9,4,-1,2,1},{1,81,1,5,8,3},{7,72,9,-8,2,-6},{5,7,2,4,8,69},{2,8,-7,98,-4,2},{6,7,75,6,2,1},{52,-6,2,-3,7,3},{68,7,4,6,1,3},{65,-2,7,-6,7,8},{6,11,3,1,8,4},{9,22,-6,8,5,-4},{6,1,8,32,7,6},{3,8,-3,45,1,-9},{9,8,6,4,99,3},{83,-9,2,6,5,-6},{35,1,5,2,1,8},{4,48,3,-9,2,-3},{6,9,5,2,7,48},{6,-2,35,-5,6,2}};
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
