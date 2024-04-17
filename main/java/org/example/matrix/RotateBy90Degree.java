package org.example.matrix;

public class RotateBy90Degree {

    public static void rotate()
    {

        int[][] matrix = new int[5][5];
        //76  59   82  17  70
        matrix[0][0] = 76;
        matrix[0][1] = 59;
        matrix[0][2] = 82;
        matrix[0][3] = 17;
        matrix[0][4] = 70;

        // 42  1     83  39  56
        matrix[1][0] = 42;
        matrix[1][1] = 1;
        matrix[1][2] = 83;
        matrix[1][3] = 39;
        matrix[1][4] = 56;

        // 66  28  65  29  53
        matrix[2][0] = 66;
        matrix[2][1] = 28;
        matrix[2][2] = 65;
        matrix[2][3] = 29;
        matrix[2][4] = 53;

        // 88  82  45  38  51
        matrix[3][0] = 88;
        matrix[3][1] = 82;
        matrix[3][2] = 45;
        matrix[3][3] = 38;
        matrix[3][4] = 51;

        // 89  24  5     51  75
        matrix[4][0] = 89;
        matrix[4][1] = 24;
        matrix[4][2] = 5;
        matrix[4][3] = 51;
        matrix[4][4] = 75;

        // Code Here

        int n = matrix.length;
        /*
        for(int i=0; i<n; i++) {

            for(int j=0; j<matrix.length; j++) {
                matrix[n-i-1][i] = matrix[i][j];
            }
            break;

        }
        */

        int noOfRotations = n/2;

        int i=0;
        int j=0;
        int temp1 =0;
        int temp2 =0;

        while(j<noOfRotations) {
            i=j;
            while(i<n-1-j) {

                /*
                matrix[n-1][0] = matrix[0][0];

                matrix[n-1][n-1] = matrix[n-1][0];

                matrix[0][n-1] = matrix[n-1][n-1];

                matrix[0][0] = matrix[0][n-1];
                */


                /*
                temp1 = matrix[n-1-j][i+j];
                matrix[n-1-j][i+j] = matrix[i+j][0+j];

                temp2 = matrix[n-1-i-j][n-1-j];
                matrix[n-1-i-j][n-1-j] = temp1;

                temp1 = matrix[0+j][n-1-i-j];
                matrix[0+j][n-1-i-j] = temp2;

                temp2 = matrix[i+j][0+j];
                matrix[i+j][0+j] = temp1;


                i++;
                */


                temp1 = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[i][j];

                temp2 = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = temp1;

                temp1 = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp2;

                temp2 = matrix[i][j];
                matrix[i][j] = temp1;

                i++;






                /*

                matrix[n-1-j][i+j] = matrix[i+j][0+j];
                matrix[n-1-i-j][n-1-j] = matrix[n-1-j][i+j];
                matrix[0+j][n-1-i-j] = matrix[n-1-i-j][n-1-j];
                matrix[i+j][0+j] = matrix[0+j][n-1-i-j];

                matrix[n-1][i] = matrix[i][0];
                matrix[n-1-i][n-1] = matrix[n-1][i];
                matrix[0][n-1-i] = matrix[n-1-i][n-1];
                matrix[i][0] = matrix[0][n-1-i];
                */
            }

            j++;
        }

    }

}
