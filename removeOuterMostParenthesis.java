class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (st.size() >= 1) {
                    ans+=s.charAt(i);
                }
                st.push(s.charAt(i));
            } else {
                if (st.size() > 1) {
                    ans+=s.charAt(i);
                }
                st.pop();
            }
        }
        
        return ans;

        
    }
}
