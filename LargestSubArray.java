//Problem statement:
//Given array with positive and negative numbers find subarray with the maximum sum

 int findLargest(int[] arr, int n) {
        int current_sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;

        while (i < n){
            current_sum += arr[i];
            max = Math.max(max, current_sum);

            if(current_sum < 0){
                current_sum = 0;
            }
            i++;
        }
        return max;
    }
