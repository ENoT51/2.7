import java.util.ArrayList;
import java.util.*;


public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(0, 0, 2, 3, 4, 4, 5, 5, 6, 7));
 private static final  List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        }
        public static void task1(){
        for (int num : nums)
            if (num % 2 != 0) {
                System.out.println(num);
            }

    }
    public static void task2(){
    Collections.sort(nums);
    int num1 = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num != num1){
                System.out.println(num);
                num1 = num;
            }
        }
    }
    public static void task3(){
        Set<String> words = new HashSet<>(strings);
        System.out.println(words);

    }
    public static void task4(){
        Set<String> words1 = new HashSet<>(strings);
        int a = strings.size();
        int b = words1.size();
        System.out.println(a - b);
    }
}

