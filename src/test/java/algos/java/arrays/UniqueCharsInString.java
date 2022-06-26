package algos.java.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueCharsInString {

    public boolean isUniqueChars2(String input) {
        boolean[] chars = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if (chars[val]) {
                return false;
            }
            chars[val] = true;
        }
        return true;
    }

    @Test
    void uniqueCharsInString() {
        assertTrue(isUniqueChars2(""));
        assertTrue(isUniqueChars2("a"));
        assertTrue(isUniqueChars2("ab"));
        assertTrue(isUniqueChars2("abc"));
        assertFalse(isUniqueChars2("aa"));
        assertFalse(isUniqueChars2("aab"));
        assertFalse(isUniqueChars2("hello"));
    }
}
