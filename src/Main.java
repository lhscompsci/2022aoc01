import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Throwable {

        partOne();
        partTwo();

    }

    private static void partTwo() throws Throwable {
        Scanner infile = new Scanner(new File("input.dat"));

      
        ArrayList<Long> elves = new ArrayList<>();
        long sum = 0L;
        while(infile.hasNext()){
            String next = infile.nextLine();
            if(next.length()==0){
                elves.add(sum);
                sum = 0L;
            }
            else {
                sum += Long.parseLong(next);
            }

        }
        if(sum != 0L)
            elves.add(sum);
        Collections.sort(elves);
        Collections.reverse(elves);
        long ans = elves.get(0) + elves.get(1) + elves.get(2);
        out.println(ans);
    }

    private static void partOne() throws Throwable {
        Scanner infile = new Scanner(new File("test.dat"));

       
        ArrayList<Long> elves = new ArrayList<>();
        long sum = 0L;
        while(infile.hasNext()){
            String next = infile.nextLine();
            if(next.length()==0){
                elves.add(sum);
                sum = 0L;
            }
            else {
                sum += Long.parseLong(next);
            }

        }
        if(sum != 0L)
            elves.add(sum);
        Collections.sort(elves);
        Collections.reverse(elves);
        Long ans = elves.get(0);
        out.println(ans);


    }
}
