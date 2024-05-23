package leetcode.arrays;

//validate row
//validate column
//validate sub boxes 3*3

import java.util.*;

public class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet = null;
        Set<Character> colSet = null;
            for(int i=0; i<9;i++){
                //intialise inside because it needs to be reinitialised at each iteration so the row data is not left in the set
                rowSet = new HashSet<>();
                colSet = new HashSet<>();
                for(int j=0; j<9; j++){
                    if(board[i][j] != '.'){
                        if(rowSet.contains(board[i][j])){
                            return false;
                        }
                        rowSet.add(board[i][j]);
                    }
                    if(board[j][i] != '.'){
                        if(colSet.contains(board[j][i])){
                            return false;
                        }
                        colSet.add(board[j][i]);
                    }
                    }
                }
            for(int i=0; i<9; i=i+3){
                for(int j=0; j<9; j=j+3){
                    if(!validSubBox(i, j, board)){
                        return false;
                    }
                }

            }
            return true;
    }
    public boolean validSubBox(int rowInd, int colInd, char[][] board){
        Set<Character> subBox = new HashSet<>();
        for(int i=rowInd; i<rowInd+3; i++){
            for(int j=colInd; j<colInd+3; j++){
                if(board[i][j] != '.'){
                    if(subBox.contains(board[i][j])){
                        return false;
                    }
                    subBox.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
