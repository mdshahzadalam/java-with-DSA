package Backtracking;

public class nQueensProblem {
    public static void printSolution(int [][]board, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int [][]board, int row, int column, int n)
    {
        int i,j;
        //check on the left row
        for(i=0;i<column;i++)
        {
            if(board[row][i]==1)
            {
                return false;
            }
        }
        //check for the upper diagonal in the left direction
        for(i=row , j=column; j>=0 && i>=0 ;i--,j--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        //check for the lower diagonal in the left direction
        for(i=row,j=column;i<n && j>=0 ;i++,j--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }
    //function to solve n queen problem 
    public static boolean solvenQueens(int [][]board, int column, int n)
    {
        //base condition
        if(column >= n)
        {
            return true;
        }
        //consider this column and try to place all the queens in all the rows one by one
        for(int i=0;i<n;i++)
        {
            //check if it is safe to place queen or not 
            if(isSafe(board, i,column, n)==true)
            {
                //place the queen on the board
                board[i][column]=1;
            
            //recursive call to place all the queens
            if(solvenQueens(board, column+1, n)==true)
            {
                return true;
            }
            //if placing the queen does not lead to solution then backtrack
            board[i][column]=0;
        }
        }
        //if it is not possible to place all the queens in any row of the given column then return false
        return false;
    }
    public static void main(String[] args) {
        int [][] board={{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};
        int n=board.length;
        if(solvenQueens(board,0,board.length)==true)
        {
            printSolution(board,board.length);
        }
        else
        {
            System.out.println("Solution does not exist.");
        }
    }
}
