class Solution {
    public int maxDepth(String s) {
        int curdepth = 0;
        int maxDepth = 0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                curdepth ++;
              maxDepth =  Math.max(curdepth,maxDepth);
            }
            else if(ch==')'){
                    curdepth --;
            }
        }
        return maxDepth;
        
    }
}