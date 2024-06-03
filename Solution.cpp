
#include <string>
using namespace std;

class Solution {

public:
    int appendCharacters(const string& source, const string& target) const {
        size_t indexSource = 0;
        size_t indexTarget = 0;

        while (indexSource < source.length() && indexTarget < target.length()) {
            if (source[indexSource] == target[indexTarget]) {
               ++indexTarget;
            }
            ++indexSource;
        }

        return target.length() - indexTarget;
    }
};
