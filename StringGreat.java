import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class StringGreat {
    public static String makeGreat(String s){
        char[] temp = s.toCharArray();
        Stack<Character> outStack = new Stack<>();
        int i = 0;
        String out = "";

        while (i < temp.length){
            if (outStack.size() > 0 && Math.abs(outStack.peek()-temp[i])==32){
                i++;
                outStack.pop();
            }else {
                outStack.push(temp[i]);
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!outStack.isEmpty()){
            char ch = outStack.pop();
            sb.append(ch);
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(makeGreat("Pp"));
    }
}
