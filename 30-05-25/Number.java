class Number{
    public static void main(String[] args) {
          int num = 4521;
          int evenCount = 0;
          int oddCount = 0;
          while(num>0){
              int digit = num%10;
              if(num%2==0){
                  evenCount=evenCount+1;
              }
              else{
                  oddCount=oddCount+1;
              }
              num = num/10;
          }
          int count = evenCount + oddCount;
          if(count==evenCount || count==oddCount){
              System.out.println("it is good number");
          } else {
              System.out.println("it is bad number");
          }
          
     
}
}