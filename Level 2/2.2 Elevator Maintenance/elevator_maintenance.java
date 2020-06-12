import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static class VersionComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            int l = Math.min(o1.length, o2.length);
            int diff;

            for (int i = 0; i <l; i++) {
                diff = o1[i] - o2[i];

                if (diff == 0) {
                    continue;
                }

                return diff;
            }

            return o1.length - o2.length;
        }
    }
    public static String[] solution(String[] l) {
        int[][] r = new int[l.length][];

        for (int i = 0; i < l.length; i++) {
            String[] b = l[i].split("\\.");
            r[i] = new int[b.length];
            for (int j = 0; j < b.length; j++) {
                r[i][j] = Integer.parseInt(b[j], 10);
            }
        }

        Arrays.sort(r, new VersionComparator());

        for (int i = 0; i < l.length; i++) {
            String s = Integer.toString(r[i][0]);
            for (int j = 1; j < r[i].length; j++) {
                s += "." + Integer.toString(r[i][j]);
            }
            l[i] = s;
        }

        return l;
    }
}