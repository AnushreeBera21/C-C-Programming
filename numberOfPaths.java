class Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        long matrix[] = new long[n];
        for(int i=0; i<n; i++){
            matrix[i] = 1;
        }
        
        for(int i=0; i<m-1; i++){
            for(int j=1; j<n; j++){
                matrix[j] = (matrix[j]+matrix[j-1])%1000000007;
            }
        }
        return matrix[n-1];
    }
}
