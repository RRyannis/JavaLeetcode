public class ThirdMax {
    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        boolean thirdMaxFound = false;

        for (int n : nums) {

            if (n == firstMax || n == secondMax || (thirdMaxFound && n == thirdMax)) {
                continue;
            }

            if (n > firstMax) {
                if (secondMax != Integer.MIN_VALUE) thirdMaxFound = true;
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            }
            else if (n > secondMax) {
                if (secondMax != Integer.MIN_VALUE) thirdMaxFound = true;
                thirdMax = secondMax;
                secondMax = n;
            }
            else if (n >= thirdMax) {
                thirdMax = n;
                thirdMaxFound = true;
            }
        }

        if (thirdMaxFound) {
            return thirdMax;
        } else {
            return firstMax;
        }
    }
}



class Solution {
    public int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer n : nums) {
            if (n.equals(firstMax) || n.equals(secondMax) || n.equals(thirdMax)) {
                continue;
            }


            if (firstMax == null || n > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (secondMax == null || n > secondMax) {
                thirdMax = secondMax;
                secondMax = n;
            } else if (thirdMax == null || n > thirdMax) {
                thirdMax = n;
            }
        }


        if (thirdMax == null) {
            return firstMax;
        }

        return thirdMax;
    }
}
