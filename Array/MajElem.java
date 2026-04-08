class MajElem {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cur = 0;
        for (int num : nums) {
            if (count == 0) {
                cur = num;
            }
            if (num == cur) {
                count++;
            } else {
                count--;
            }
        }
        return cur;
    }
}
