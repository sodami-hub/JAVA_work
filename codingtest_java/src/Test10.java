import java.util.Stack;

public class Test10 {
    private static boolean check(String pat) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> mStack = new Stack<>();
        Stack<Character> lStack = new Stack<>();
        char ch;
        for (int i = 0; i < pat.length(); i++) {
            ch = pat.charAt(i);
            switch (ch) {
                case '(':
                    sStack.push(ch);
                    break;
                case '{':
                    mStack.push(ch);
                    break;
                case '[':
                    lStack.push(ch);
                    break;
                case ')':
                    if (sStack.isEmpty()) return false;
                    sStack.pop();
                    break;
                case '}':
                    if (mStack.isEmpty()) return false;
                    mStack.pop();
                    break;
                case ']':
                    if (lStack.isEmpty()) return false;
                    lStack.pop();
                    break;
            }
        }
        if ((sStack.isEmpty() && mStack.isEmpty()) && lStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static int solution(String pat) {
        StringBuilder clone = new StringBuilder();
        int len = pat.length();
        boolean checked;
        int result = 0;
        for (int i = 0; i < len; i++) {
            checked=false;
            clone.delete(0,clone.length());
            for(int j = 1; j< len; j++) {
                clone.append(pat.charAt(j));
            }
            clone.append(pat.charAt(0));
            System.out.println(clone.toString());
            checked = check(clone.toString());
            if(checked){
                result++;
            }
            pat=clone.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        int result;
        String a = "[]{}()";
        result = solution(a);
        System.out.println("result = " + result);

        a= "}]()[{";
        result=solution(a);
        System.out.println("result = " + result);
    }
}
