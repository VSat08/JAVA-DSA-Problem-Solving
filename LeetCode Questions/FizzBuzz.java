import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static  List<String> fizzBuzz(int n) {
        String arr [] = new String[n];

        for(int i=1; i<=n ; i++){
            if(i%3 == 0 && i%5 ==0){
                arr[i-1] = "Fizzbuzz";
            }
            else if(i%3 == 0){
                 arr[i-1] ="Fizz";
            }
            else if(i%5 == 0){
               arr[i-1] = "Buzz";
            }
            else{
               arr[i-1] = Integer.toString(i);
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));

    }
}
