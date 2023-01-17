public class hollowrect {
    public static void hollowrectangle(int rows, int col){
        for(int i=1;i<=rows;i++){
            for(int j =1;j<=col;j++){
                if(i==1 || rows==i || j==1 || col==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
    public static void main(String[] args) {
        hollowrectangle(4, 5);
                                                  
    }
    
}
