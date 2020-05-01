public class Main {
    public static void main(String[] args) {


    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        }
        if (nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public static boolean sameFirstLast(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 1) {
                return true;
            }
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public static int[] makePI() {
        int[] pi = new int[]{3, 1, 4};
        return pi;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        }
        if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] numsRotated = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 3 == 0) {
                numsRotated[i] = nums[nums.length - 1 - 1];
            } else if (i % 3 == 1) {
                numsRotated[i] = nums[nums.length - 1];
            } else {
                numsRotated[i] = nums[nums.length - 1 - i];
            }
        }
        return numsRotated;
    }

    public static int[] reverse(int[] nums) {
        int[] numsRotated = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 3 == 0) {
                numsRotated[i] = nums[nums.length - 1];
            } else {
                numsRotated[i] = nums[nums.length - 1 - i];
            }
        }
        return numsRotated;
    }

    public static int[] maxEnd(int[] nums) {
        int[] newArray = new int[nums.length];
        int max = 0;
        if (nums[0] > nums[2]) {
            max = nums[0];
        } else {
            max = nums[2];
        }
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = max;
        }
        return newArray;
    }

    public static int sum2(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i = 0; i < 2; i++) {
                sum += nums[i];
            }
        }
        return sum;
    }


}
