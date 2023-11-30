class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[k] != nums[i]){
                nums[++k] = nums[i]; //pre-incrementi per ottimizzare la velocità di esecuzione
            }
        }
        return ++k;
    }
}
