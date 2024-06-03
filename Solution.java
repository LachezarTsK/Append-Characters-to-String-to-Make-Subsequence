
public class Solution {

    public int appendCharacters(String source, String target) {
        int indexSource = 0;
        int indexTarget = 0;

        while (indexSource < source.length() && indexTarget < target.length()) {
            if (source.charAt(indexSource) == target.charAt(indexTarget)) {
                ++indexTarget;
            }
            ++indexSource;
        }

        return target.length() - indexTarget;
    }
}
