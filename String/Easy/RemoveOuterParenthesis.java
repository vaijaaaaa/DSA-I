package String.Easy;

public class RemoveOuterParenthesis {
        public String removeOuterParentheses(String s) {
            int n = s.length();
            int count = 0;
            StringBuilder ans = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ')') 
                    count--;
    
                if (count != 0) 
                    ans.append(s.charAt(i));
    
                if (s.charAt(i) == '(') 
                    count++;
            }
            return ans.toString();
        }
    
        public static void main(String[] args) {
            String s = "(()())(())";
            
            // Creating an instance of MainClass
            RemoveOuterParenthesis obj = new RemoveOuterParenthesis();
            
            // Calling the method and printing the result
            String result = obj.removeOuterParentheses(s);
            System.out.println(result);
        }
    }
    

