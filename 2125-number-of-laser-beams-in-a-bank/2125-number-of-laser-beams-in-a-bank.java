class Solution {
    public int numberOfBeams(String[] bank) {
         int beams = 0;
        int prevDevices = 0;
          // Count devices per row
       
        for (String row : bank) {
            int currentDevices = 0;
            // Count '1's in the current row
            for (char c : row.toCharArray()) {
                if (c == '1') currentDevices++;
            }
            
         if (currentDevices > 0) {
                beams += prevDevices * currentDevices;
                prevDevices = currentDevices; // Update previous row
            }
        }
        
        return beams;
    }
}