import java.util.*;

class LAB_23 {
    public static int findLongestConsecutiveSequence(int[] nums) {
        Arrays.sort(nums);

        int longestSequence = 0;
        int currentSequence = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentSequence++;
                } else {
                    longestSequence = Math.max(longestSequence, currentSequence);
                    currentSequence = 1;
                }
            }
        }

        longestSequence = Math.max(longestSequence, currentSequence);

        return longestSequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int longestSequenceLength = findLongestConsecutiveSequence(nums);
        System.out.println("Length of the longest consecutive sequence: " + longestSequenceLength);
    }
}
