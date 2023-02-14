class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        char c[]=s.toCharArray();
        int mc=Integer.MIN_VALUE;
        int count=0;
        for(char e:c){
            
            if(e!='(' && e !=')' ) continue;
            else{
                if(e=='('){
                    st.push(e);
                    count++;
                    if(mc<=count) mc=count;
                }else{
                    st.pop();
                    count--;
                }
            }
        }
        return mc>0?mc:0;
        
    }
}
