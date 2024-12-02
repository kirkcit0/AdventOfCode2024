import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Puzzle1{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        while(sc.hasNextInt()){
            arr1.add(sc.nextInt());
            arr2.add(sc.nextInt());
        }

        sc.close();

        Collections.sort(arr1);
        Collections.sort(arr2);
        int sum = 0;

        for(int i=0; i<arr1.size(); i++){
            sum += Math.abs(arr1.get(i) - arr2.get(i));
        }

        System.out.println(sum);

    }
}