class FibonacciSeries {
    static int fibonacci(int n){
    if(n==0){
    return 0;
    }else if(n==1){
        return 1;
    }else{
        return fibonacci(n-1)+fibonacci(n-2);
    }
    }
    public static void main(String[] args) {
        int terms=7;
        System.out.print("Fibonacci series:");
        for(int i=0;i<terms;i++){
        System.out.print(fibonacci(i)+" ");
        }
    }
}