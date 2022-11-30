import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println("Hello world!");
        int value = 0;

        //Loops
        // 2 families
        //  - conditional -- while loops
        //  - fixed iteration -- for loops
        // examples
        while (value <= 20){
            value++;
            out.println(value);

        }
        out.println("done");

        for( int index = 30  ; index > 15  ; index -= 4   ){
            out.println("passthrough");
        }

    }
}