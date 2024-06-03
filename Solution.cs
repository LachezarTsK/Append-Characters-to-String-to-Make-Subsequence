
using System;

public class Solution
{
    public int AppendCharacters(string source, string target)
    {
        int indexSource = 0;
        int indexTarget = 0;

        while (indexSource < source.Length && indexTarget < target.Length)
        {
            if (source[indexSource] == target[indexTarget])
            {
                ++indexTarget;
            }
            ++indexSource;
        }

        return target.Length - indexTarget;
    }
}
