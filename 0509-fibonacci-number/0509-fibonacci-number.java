class Solution {
    public int fib(int n) {
        if (n==0) return 0;
        if(n==1) return 1;
        int p=0 ; // previous
        int c=1 ;// current
        for(int i =2;i<=n;i++){
             int next = p+c;
             p=c;
             c=next;
        }
      return c;
    }
}