import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Puzzle1{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("input.txt"));
        int safe = 0;

        while(sc.hasNextLine()){
            ArrayList<Integer> nums = new ArrayList<>();
            String[] temp = sc.nextLine().split("\\s+");
            for(String num : temp) nums.add(Integer.parseInt(num));

            boolean increasing = false;
            boolean decreasing = false;
            boolean sminc = true;

            int n = nums.size();
            for(int i=1; i<n; i++){
                if(nums.get(i-1) > nums.get(i)) {
                    decreasing = true;
                } else if(nums.get(i-1) < nums.get(i)) {
                    increasing = true;
                } else {
                    sminc = false;
                    break;
                }
                
                if(Math.abs(nums.get(i-1) - nums.get(i)) > 3) {
                    sminc = false;
                    break;
                }

                if(increasing && decreasing) break;
            }

            if((increasing ^ decreasing) && sminc) {
                safe++;
            }
            

        }

        sc.close();
        System.out.println(safe);
    }
}