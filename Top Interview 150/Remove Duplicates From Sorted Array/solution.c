int removeDuplicates(int* nums, int numsSize) {
    int k = 0;
    int n = numsSize;
    for(int i = 1; i < n; i++){
        if(nums[k] != nums[i]){
            nums[++k] = nums[i]; //pre-incrementi per ottimizzare la velocità di esecuzione
        }
    }
    return ++k;
}
