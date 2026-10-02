class Solution {
    public int[] sortByBits(int[] arr) {
    List<Pair<Integer, Integer>> pairs = new ArrayList<>();
    for (int num : arr) {
        pairs.add(new Pair(countBits(num), num));
    }
      pairs.sort((a, b) -> {
        if (a.getKey() != b.getKey()) {
            return a.getKey() - b.getKey();
        } else {
            return a.getValue() - b.getValue();
        }
    });
      int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        result[i] = pairs.get(i).getValue();

    }
    
      return result;

    }
    private int countBits(int num) {
    int count = 0;
    while (num > 0) {
        count += num & 1;
        num >>= 1;
    }
    return count;
}
}