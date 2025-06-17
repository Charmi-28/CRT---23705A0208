import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KnapsackMemo{
    static class Key{
        int n,W;
        Key(int n,int W){
            this.n=n;
            this.W=W;
        }
        @Override
        public boolean equals(Object o){
            if(this==o)return true;
            if(!(o instanceof Key ))return false;
            Key key=(Key)o;
            return n==key.n && W==key.W;
        }
        @Override
        public int hashCode(){
            return Objects.hash(n,W);
        }
    } 
    public static int knapsackMemo(int[] weight,int[] profit,int W,int n,Map<Key,Integer>memo){
        if(n==0 || W==0){
            return 0;
        }
            Key key=new Key(n,W);
            if(memo.containsKey(key)){
                return memo.get(key);
            }
            int result;
            if(weight[n-1]>W){
                result=knapsackMemo(weight,profit,W,n-1,memo);
            }else{
                int include=profit[n-1]+knapsackMemo(weight,profit,W-weight[n-1],n-1,memo);
                int exclude=knapsackMemo(weight,profit,W,n-1,memo);
                result=Math.max(include,exclude);
            }
            memo.put(key,result);
            return result;
        }
        public static void main(String[] args){
            int W1=4;
            int[] profit1={1,2,3};
            int[] weight1={4,5,1};
            int n1=profit1.length;
            Map<Key,Integer>memo=new HashMap<>();
            System.out.println("output(memoization):"+knapsackMemo(weight1,profit1,W1,n1,memo));
        }
    }
