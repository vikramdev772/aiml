import java.io.PrintStream;
import src.controller.service.A;


public class Index{
    public static void main(String[] args)throws Exception {
        PrintStream ps=new PrintStream("out.py");
        ps.print("\n\t Hello \n");
        ps.print("\n\t object : "+new A().x);
    }
}