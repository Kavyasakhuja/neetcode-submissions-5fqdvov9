class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total=1;
        int n=nums.length;
        int[] result=new int[n];
        int zerocount=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocount ++ ;
            }else{
                total=total*nums[i];
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(zerocount>1){
                result[i]=0;
            }
            else if(zerocount == 1){
                result[i]=(nums[i]==0)? total:0;
            }
            else{
                result[i]=total/nums[i];
            }
            
        }
        return result;
    }
}  
