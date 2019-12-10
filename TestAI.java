package ir.ateam.ucmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestAI {

    private int[] numbers = {3, 4, 5, 5, 6, 8, 8, 8};
    private int[] minusnums = {1, 1, 2, 2, 2, 2, 3, 3};
    private int[] dnums = {0, 0, 1, 1, 1, 1, 1, 1};

    public List<Integer> Elementary() {
        List<Integer> list = new ArrayList<>();
        for (int x = 0; x < 8; x++) {
            for (int i = 0; i < 25; i++) {

                int sum = 0;
                int minus = minusnums[x];

                for (int j = 0; j < numbers[x]; j++) {
                    do {

                        int rnd = getRandom(1, dnums[x]);
                        sum += rnd;
                        if (sum > 0)
                            list.add(rnd);
                        else
                            sum -= rnd;
                    } while (sum < 0);
                }
            }
        }
        return list;
    }


    private static int getRandom(int min, int max) {
        int spread = max - min;
        return new Random().nextInt(spread + 1) + min;
    }
}
