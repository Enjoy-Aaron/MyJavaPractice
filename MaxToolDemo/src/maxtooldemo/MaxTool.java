package maxtooldemo;

public class MaxTool {
    private MaxTool() {

    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int max(int a, int... nums) {
        int maxVal = a;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }

    public static double max(double a, double... nums) {
        double maxVal = a;
        for (double num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }

    public static String max(String aStr, String... strs) {
        String maxStr = aStr;
        for (String str : strs) {
            if (str.compareTo(maxStr) > 0) {
                maxStr = str;
            }
        }
        return maxStr;
    }
}
