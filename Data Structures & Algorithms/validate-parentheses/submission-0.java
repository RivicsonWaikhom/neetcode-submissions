class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for (char ch:s.toCharArray()){
            if( ch=='('|| ch =='{' || ch=='['){
                stack.push(ch);
            }    
            else {
                if (stack.isEmpty()) return false; // No opening bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||(ch == '}' && top != '{') ||(ch == ']' && top != '[')) {
                    return false;
                    }
            }
        }
        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }
}




    