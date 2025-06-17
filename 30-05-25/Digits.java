public class Digits {
    public static void main(String[] args) {
        int num = 4521;
        int count = 0;
        while(num>0){
            num = num/10;
            count = count + 1;
        }
        System.out.println("number of digits are:"+count);
    }
}