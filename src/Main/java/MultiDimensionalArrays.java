import java.util.Arrays;

class MultiDimensionalArrays{
    public static void main(String[] args){
         int[][] numbers=new int[2][3];
         numbers[0][1]=1;
        System.out.println(Arrays.deepToString(numbers));
    }
}