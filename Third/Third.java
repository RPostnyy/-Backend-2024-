import java.util.*;

public class Third {
    public static int maxTwoSum(List<Integer> nums) {
        if (nums.size() < 2) {
            throw new IllegalArgumentException("Список должен содержать как минимум два числа");
        }
        List<Integer> sortedNums = new ArrayList<>(nums);
        Collections.sort(sortedNums, Collections.reverseOrder());
        return sortedNums.get(0) + sortedNums.get(1);
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 7, 4, 1, 8);
        System.out.println("Наибольшая сумма двух чисел в списке: " + maxTwoSum(nums));
    }
}
