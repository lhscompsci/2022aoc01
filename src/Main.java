import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Throwable {
        // write your code here
        partOne();
        partTwo();

    }

    private static void partTwo() throws FileNotFoundException {
        Scanner infile = new Scanner(new File("input.dat"));



    }

    private static void partOne() throws FileNotFoundException {
        Scanner infile = new Scanner(new File("test.dat"));

        String opens = "([{<";
        String closes = ")]}>";

        long sum = 0L;

        while(infile.hasNext()){

            Stack<String> stack = new Stack<>();
            String s = infile.nextLine();
            out.println(s);
            Scanner line = new Scanner(s);
            line.useDelimiter("");
            boolean broken = false;
            while(!broken&& line.hasNext()){
                String l = line.next();
                out.print(l);
                if(opens.contains(l))
                    stack.push(l);
                else {
                    String o = stack.pop();
                    if(l.equals(")")&&!o.equals("(")){
                        broken = true;
                        sum+=3L;
                    }
                    else if(l.equals("]")&&!o.equals("[")){
                        broken = true;
                        sum += 57L;
                    }
                    else if (l.equals("}")&&!o.equals("{")){
                        broken = true;
                        sum += 1197L;
                    }
                    else if (l.equals(">")&&!o.equals("<")){
                        broken = true;
                        sum += 25137L;
                    }
                }
            }
            out.println();
        }
        out.println(sum);


    }
}
