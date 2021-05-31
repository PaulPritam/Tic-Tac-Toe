public class TwoArrays {
    public static void main(String[] args) {
//        int[][] twoD = new int[2][2];
//        twoD[0][0] = 10 ;
//        twoD[0][1] = 20;
//        twoD[1][0] = 30;
//        twoD[1][1] = 40;

        int[][] twoD = {{10,20,30},
                {100,200,300},
                {1,2,3},
                };

        for (int i = 0; i < twoD.length ; i++) {
            System.out.println(twoD[i][i]);
        }
        System.out.println("--------- ");

        for (int i = 0; i <twoD.length ; i++) {
            for(int j = 0; j< twoD[i].length ; j++){
                System.out.println(twoD[i][j]);
            }
        }
    }
}
