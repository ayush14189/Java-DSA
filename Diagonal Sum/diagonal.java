public class diagonal {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i=0; i<matrix.length; i++)  { //   O(n^2)
            for (int j=0; j<matrix[0].length; j++){
                if (i == j) {
                    sum += matrix[i][j];
                }
                else if (i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        int newSum = 0;
        for (int i=0; i<matrix.length; i++) {
            //  Primary Diagonal
            newSum += matrix[i][i];
            //  Secondary Diagonal
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return newSum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8}, 
                        {9,10,11,12},
                        {13,14,15,16}};
        diagonalSum(matrix);
    }    
}
