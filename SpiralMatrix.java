class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top =0;
        int bottom = m-1;
        int left =0;
        int right = n-1;
        int idx = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while( top <= bottom & left <= right){

            for( int j= left; j<=right; j++ ){
                result.add(matrix[top][j]);
            }
             
            top++;
            if( top <= bottom & left <= right){

                for(int i=top; i<=bottom ; i++){
                  result.add(matrix[i][right]);
                }
                right--;
            }
             
             if( top <= bottom & left <= right){

                 for(int j=right; j>=left ; j--){
                  result.add(matrix[bottom][j]);
                }
                bottom--;
             }
             
             

             if( top <= bottom & left <= right){

                 for(int i=bottom; i>=top ; i--){
                  result.add(matrix[i][left]);
                }
                left++;
             }

             
             }

             return result;
             
             }




        }

        
        
        /**
        
        
        TC : O(m*n) : Iterating whole matrix.

        Sc : O(1) : There is no extra space .

        Description : Squeezing top, right, bottom and left and storing the values inside array. We can remember in this way [top, right, bottom , left].

        
        
         */

    