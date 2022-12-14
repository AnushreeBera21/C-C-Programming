class Solution 
{
    public:
    bool issafe(int grid[N][N],int row,int col,int val){
        for(int i=0;i<9;i++){
            if(grid[row][i]==val)
                return false;
            if(grid[i][col]==val)
                return false;
            if(grid[3*(row/3)+i/3][3*(col/3)+i%3]==val)
                return false;
        }
        return true;
    }
    //Function to find a solved Sudoku. 
    bool SolveSudoku(int grid[N][N])  
    { 
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(grid[row][col]==0){
                    for(int val=1;val<=9;val++){
                        if(issafe(grid,row,col,val)){
                            grid[row][col]=val;
                        bool furtherpossible= SolveSudoku(grid);
                        if(furtherpossible)
                            return true;
                        else
                            grid[row][col]=0;
                        }
                        //then check for further solution 
                        
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    void printGrid (int grid[N][N]) 
    {
       
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               cout<<grid[i][j]<<" ";
           }
       }
    }
};
