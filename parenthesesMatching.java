import java.util.Stack;

public class parenthesesMatching {
    public boolean isValid(String s){
        if(s.length() <= 1){
            return false;
        }    
        if(s.length() % 2 !=0){
            return false;
        }

        Stack <Character> check = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                check.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)== ')'){
                    if(check.pop()!= '('){
                        return false;
                    }
                }
                if(s.charAt(i)== ']'){
                    if(check.pop()!= '['){
                        return false;
                    }
                }
                if(s.charAt(i)== '}'){
                    if(check.pop()!= '{'){
                        return false;
                    }
                }
                if(check.isEmpty() == false){
                    return false;
                }
            }
        }
        return check.isEmpty();

    }
}