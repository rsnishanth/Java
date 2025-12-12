import java.util.Arrays;
public class multidimension {
    public static void main(String[] args) {
       // int[][] multidim = new int[3][];
        int[][] multidim = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println(Arrays.deepToString(multidim));
    }
}
