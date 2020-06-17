public class Solution {

    public static int solution(int start, int length) {
        int result = start;
        int i = start + 1;
        int skip = 0;
        int acc = length - 1;
        int end = length * length + start;

        while (i < end) {
            result ^= i;

            if (acc <= 1) {
                i += skip;
                skip++;
                acc = length - skip;
            } else {
                acc--;
            }
            i++;
        }

        return result;
    }
}