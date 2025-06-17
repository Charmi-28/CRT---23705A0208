public class MinValue {
    public static void main(String[] args) {
        int[]nums={4,9,8,2,1,14};
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            int value=nums[i];
            if(value<min){
                min=value;
            }
        }
        System.out.println("min:"+min);
    }
}