class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
                
            if(dh(nums[i])%2 !=0){
                cnt +=1;
            }
            
        }
        return cnt;
    }
    
    public int dh(int number){
        int digits = 0;
        
        while(true){
            if(number/10 >0 ){
                number = number / 10;
                digits +=1;
                
            }else
                break;
        }
        return digits;
    }
}
