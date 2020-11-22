package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge4 {
    static int Pair3(List<Integer> arr, int n) {
        int val = 0, l, r, x;
        int[] arr1 = new int[n];
        Collections.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr1[i] == 0) {
                l = i + 1;
                r = n - 1;
                x = arr.get(i);
                while (l < r) {
                    if (x + arr.get(l) + arr.get(r) == 0) {
                        val++;
                        arr1[i] = 1;
                        arr1[r] = 1;
                        arr1[l] = 1;
                        l++;
                        r--;
                        break;
                    } else if (x + arr.get(l) + arr.get(r) < 0) {
                        l++;
                        while (arr1[l] == 1 && l < r) {
                            l++;
                        }
                    } else {
                        r--;
                        while (arr1[r] == 1 && r > l) {
                            r--;
                        }
                    }
                }
            }

        }
        return val;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(-1);
        arr.add(-1);
        arr.add(2);
        System.out.println(Pair3(arr, 4));


    }
}
