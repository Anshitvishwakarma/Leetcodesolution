class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans =new ArrayList<>();
   
        fun(ans,"",0,0,n);
        return ans;
    }
    public void  fun(List<String> ans,String s,int c,int o,int n){
        if(o==n && c==n){
            ans.add(s);
            return ;
        }
        if(o<n){
            fun(ans,s+"(",c,o + 1,n);
        }
if(c<o){
    fun(ans,s+")",c + 1,o,n);
}
    }



    }
