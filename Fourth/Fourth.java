package Fourth;

import java.util.List;

public class Fourth {
    public static int binarySearch(List<Integer> sortedList, int target) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedList.get(mid) == target) {
                return mid;
            }
            if (target < sortedList.get(mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> sortedList = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17);
        int target = 11;
        int index = binarySearch(sortedList, target);
        if (index != -1) {
            System.out.println("Элемент " + target + " найден в позиции " + index);
        } else {
            System.out.println("Элемент " + target + " не найден");
        }
    }
}

