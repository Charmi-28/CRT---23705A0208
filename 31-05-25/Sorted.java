public class Sorted {
    public static void main(String[] args) {
        int[]nums={200,150,130,125};
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                flag=1;
            }
        }
        System.out.println(flag==0?"sorted":"not sorted");
    }
}