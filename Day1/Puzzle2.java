import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Puzzle2{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        
        int similarity = 0;

        ArrayList<Integer> hawk1 = new ArrayList<>();
        HashMap<Integer, Integer> hawk2 = new HashMap<>();

        while(sc.hasNextInt()){
            hawk1.add(sc.nextInt());
            int num = sc.nextInt();
            if(!hawk2.containsKey(num)){
                hawk2.put(num, 1);
            } else {
                hawk2.put(num, hawk2.get(num)+1);
            }
        }

        for(int i : hawk1){
            if(hawk2.containsKey(i)){
                similarity += i * hawk2.get(i);
            }
        }


        System.out.println(similarity);
    }
}