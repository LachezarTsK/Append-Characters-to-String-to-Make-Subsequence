
class Solution {
    fun appendCharacters(source: String, target: String): Int {
        var indexSource = 0
        var indexTarget = 0

        while (indexSource < source.length && indexTarget < target.length) {
            if (source[indexSource] == target[indexTarget]) {
                ++indexTarget
            }
            ++indexSource
        }

        return target.length - indexTarget
    }
}
