class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int direction = 1;
        int rmin = 0, rmax = matrix.length-1;
        int cmin = 0, cmax = matrix[0].length-1;
        int i=0, j=0;
        while(i <= rmax && i >= rmin && j <= cmax && j >= cmin){
            list.add(matrix[i][j]);
            if(direction == 1)
            {
                if(j == cmax){
                    if(i+1 <= rmax){
                        rmin++;
                        i++;
                        direction = 2;
                    }
                    else{
                        break;
                    }
                }
                else{
                    j++;        
                }
            }
            else if(direction == 2){
                if(i == rmax){
                    if(j-1 >= cmin){
                        j--;
                        cmax--;
                        direction = 3;
                    }
                    else{
                        break;
                    }
                }
                else{
                    i++;
                } 
            }
            else if(direction == 3){
                if(j == cmin){
                    if(i-1 >= rmin){
                        i--;
                        rmax--;
                        direction = 4;
                    }
                    else{
                        break;
                    }
                }
                else{
                    j--;
                } 
            }
            else if(direction == 4){
                if(i == rmin){
                    if(j+1 <= cmax){
                        j++;
                        cmin++;
                        direction = 1;
                    }
                    else{
                        break;
                    }
                }
                else{
                    i--;
                }
            }
        }
        return list;
    }
}
