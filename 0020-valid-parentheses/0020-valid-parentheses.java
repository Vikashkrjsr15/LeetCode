class Solution {
    public boolean isValid(String s) {
        StringBuilder stack = new StringBuilder();   
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.append(c);
            } else {
                if (stack.length() == 0) {
                    return false;
                }
                char last = stack.charAt(stack.length() - 1);
                if ((c == ')' && last == '(') || 
                    (c == '}' && last == '{') || 
                    (c == ']' && last == '[')) {
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    return false;
                }
            }
        }
        return stack.length() == 0;
    }
}