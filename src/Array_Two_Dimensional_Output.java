public class Array_Two_Dimensional_Output {

    public static void myMatrix(int matrix[][]){
        for (int [] row : matrix)
        {
            for (int element : row)
            {
                System.out.print( element  + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {  { 1, 2, 3, 4 , 5 },
                { 5, 4, 3, 2 , 1 },
                { 7, 8, 9, 1 ,5 , 7 , 7 } };
        myMatrix(matrix);
    }


}
