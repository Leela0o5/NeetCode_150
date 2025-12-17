class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minp = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.size();i++)
        {
            minp = min(minp,prices[i]);
            maxprofit = max(maxprofit,prices[i]-minp);
            
        }
    return maxprofit;
    }
};
