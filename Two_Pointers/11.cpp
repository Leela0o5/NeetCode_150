class Solution {
public:
    int maxArea(vector<int>& heights) {
        int i=0;
        int j= heights.size()-1;
        int hei = heights[i];
        int len = 0;
        int area = 0;
        while(i<j)
        {
            hei = min(heights[i],heights[j]);
            len = j-i;
            area = max(area,hei*len);
            if(heights[i] < heights[j] && area >= heights[i]*len )
            {
                i++;
            }
            else
            {
                j--;
            }
            
        }
        return area;
    }
};
