class Solution {
    public int removeDuplicates(int[] nums) {
        int size =1;;
    
        for(int i=1;i <nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[size]=nums[i];
                      size ++;
            }
      
        }
        return size;
    }
}