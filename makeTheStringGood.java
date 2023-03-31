class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(!st.isEmpty() && Math.abs(st.peek()-curr)==32) st.pop();
            else st.push(curr);
            
            
        }
        String ans="";
        while(!st.isEmpty()) ans= (st.pop()+"")+ans;
        return ans;
        
    }
}
