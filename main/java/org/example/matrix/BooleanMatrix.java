package org.example.matrix;

public class BooleanMatrix {

    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    public static void booleanMatrix()
    {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;

        boolean[] rowArr = new boolean[matrix.length];
        boolean[] columnArr = new boolean[matrix[0].length];
        // code here
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 1) {
                    rowArr[i] = true;
                    columnArr[j] = true;
                }
            }
        }

        for(int i=0; i<rowArr.length; i++) {
            if(rowArr[i]) {
                for(int j=0; j<matrix[0].length; j++) {
                    matrix[i][j] =1;
                }
            }
        }

        for(int i=0; i<columnArr.length; i++) {
            if(columnArr[i]) {
                for(int j=0; j<matrix.length; j++) {
                    matrix[j][i] =1;
                }
            }
        }

    }


}
