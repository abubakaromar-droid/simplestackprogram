import java.util.stack
public class undo {
    public static void main(String[] args){
        Stack<String> actions = new Stack<>();
        actions.push("Hello")
        actions.push("World")
        actions.push("Program")

        System.out.println("Last action: " + actions.peek());
        while(!actions.isEmpty()){
            System.out.println("Undo -> " + actions.pop());
        }
    }
}
