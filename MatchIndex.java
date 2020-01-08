public class MatchIndex {
    void reorder(int[] arr, int[] ind, int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[ind[i]] = arr[i];
        }
    }
}
