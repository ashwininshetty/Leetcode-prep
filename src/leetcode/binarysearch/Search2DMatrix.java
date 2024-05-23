package leetcode.binarysearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low =0, high = matrix.length * matrix[0].length -1, mid, value;
        int columns = matrix[0].length;
        while(low<=high){
            mid = (high-low)/2+low;
            value = matrix[mid/columns][mid%columns];
            if(value==target){
                return true;
            } else if(target<value){
              high = mid-1;
              continue;
            }
            low=mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix SD = new Search2DMatrix();
        System.out.println(SD.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13));
    }
}
