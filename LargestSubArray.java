int findLargest(int[] arr, int n) {
        int max = 0;
        int current_sum = Integer.MIN_VALUE;
        int i = 0;

        while (i < n){
        max += arr[i];
        current_sum = Math.max(max, current_sum);

        if(max < 0){
        max = 0;
        }
        i++;
        }
        return current_sum;
}