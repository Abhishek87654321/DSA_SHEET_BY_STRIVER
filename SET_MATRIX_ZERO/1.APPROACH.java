void setMatrixZero(int[][] matrix){
    int rows = matrix.length;
    int cols = matrix[0].length;
    int dummy_rows[] = new int[rows];
    int dummy_cols[] = new int[cols];
    Arrays.fill(dummy_rows, -1);  // all fill by -1
    Arrays.fill(dummy_cols, -1);  // all fill by -1
    for(int i = 0; i< rows; i++){
        for(int j = 0; j<cols; j++){
          if(matrix[i][j] == 0){
            dummy_rows[i] = 0;
            dummy_cols[j] = 0;
          }
        }
    }

    for(int i = 0; i< rows; i++){
        for(int j = 0; j<cols; j++){
          if(dummy_rows[i] == 0 || dummy_cols[j] == 0){
            matrix[i][j] = 0;
          }
        }
    }
}