public class hollowsquare {

    public static void main(String[] args) {
        hollowsquare a = new hollowsquare();
        a.dortgen(10,10);
    }
    
    public void dortgen(int x, int y){

        int i;
        int j;

        for(i=0;i<x;i++){

            for(j=0;j<y;j++){

                if(i==0 || i==x-1){
                    System.out.print("*");
                }
                else{
                    if(j==0 || j== (y-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }    
                
            }
            System.out.println();
        }
        
    }

}
