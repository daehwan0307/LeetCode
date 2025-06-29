class  Solution {
        public int[] sortedSquares(int[] nums) {

            int[] arrs = new int[nums.length];

            for(int i=0; i<nums.length;i ++){
                arrs[i] = nums[i]*nums[i];
            }
            Arrays.sort(arrs);
            return arrs;
        }
    }