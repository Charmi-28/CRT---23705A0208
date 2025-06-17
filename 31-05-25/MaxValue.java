public class MaxValue {
    public static void main(String[] args) {
        int[]nums={4,9,8,2,1,14};
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int value=nums[i];
            if(value>max){
                max=value;
            }
        }
        System.out.println("max:"+max);
    }
}