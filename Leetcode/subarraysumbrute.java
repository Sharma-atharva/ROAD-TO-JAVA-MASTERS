public class subarraysumbrute {
    public static void subarraysum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
           int start=i;
            for(int j=i;j<numbers.length;j++){
                 int end= j;
                 currsum=0;
                 for(int k=start;k<=end;k++){
                    currsum= currsum+numbers[k];

                 }
                 if(maxsum<currsum){
                    maxsum=currsum;
                 }
                 
            }
        }
         System.out.print(maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,-1,-4,5,8,-3};
        subarraysum(numbers);
    }
    
}
