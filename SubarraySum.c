class Solution
{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(int arr[], int n, long long s)
    {
        long long int sum = 0;
        vector<int> indices;
        for(int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                sum += arr[j];
                if(sum==s) {
                    indices.push_back(i+1);
                    indices.push_back(j+1);
                    return indices;
                }
                else {
                    indices.clear();
                }
            }
            sum = 0;
        }
        indices.push_back(-1);
        return indices;
    }
};
