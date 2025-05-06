import java.util.Arrays;

class Arrayss{
    public static void main(String[] args){
        int[] numbers=new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=5;
        numbers[3]=20;
        numbers[4]=8;
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] number={2,3,4,5,6};
        System.out.println(numbers.length);
    }


}