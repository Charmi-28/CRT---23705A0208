public class EvenElements {
    public static void main(String[] args) {
        int[]nums={4,9,8,2,1,14};
        int count=0;
        for(int i=0;i<=nums.length;i++){
            if(i%2==0){
                count=count+1;
            }
        }
        System.out.println("No of even elements in an array:"+count);
    }
}