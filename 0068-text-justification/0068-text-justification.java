class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
          List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < words.length) {
            // Determine how many words fit in the current line
            int lineLength = words[i].length();
            int j = i + 1;
            
            while (j < words.length && lineLength + (j - i) + words[j].length() <= maxWidth) {
               lineLength += words[j].length();
                j++;
            }
            
            // Calculate spaces needed
            int spacesNeeded = maxWidth - lineLength;
            int numberOfWords = j - i;
            
            StringBuilder line = new StringBuilder();
            
            // Last line or single word line: left-justified
            if (j == words.length || numberOfWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }
                // Pad remaining spaces at the end
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                // Fully justify the line
                int spacesBetween = spacesNeeded / (numberOfWords - 1);
                int extraSpaces = spacesNeeded % (numberOfWords - 1);
                
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        // Add spaces between words
                        int spacesToAdd = spacesBetween + (k - i < extraSpaces ? 1 : 0);
                        for (int s = 0; s < spacesToAdd; s++) {
                            line.append(" ");
                        }
                    }
                }
            }
            
            result.add(line.toString());
            i = j;
        }
        
        return result;
    }
}