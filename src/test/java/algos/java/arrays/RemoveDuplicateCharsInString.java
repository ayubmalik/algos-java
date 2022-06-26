package algos.java.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicateCharsInString {

    public char[] removeDuplicates(char[] str) {
        if (str == null) {
            return null;
        }
        int len = str.length;
        if (len < 2) {
            return str;
        }
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        System.out.println("tail = " + tail);
        if (tail < len) {
            str[tail] = 0;
        }
        return str;
    }


    @Test
    void removeDuplicates() {
        assertThat(removeDuplicates(null)).isNull();
        assertThat(removeDuplicates(new char[]{})).isEmpty();
        assertThat(removeDuplicates(new char[]{'a'})).containsExactly('a');
        assertThat(removeDuplicates(new char[]{'a', 'b'})).containsExactly('a', 'b');
        assertThat(removeDuplicates(new char[]{'a', 'e', 'c'})).containsExactly('a', 'e', 'c');
        assertThat(removeDuplicates(new char[]{'a', 'a', 'b'})).containsExactly('a', 'b', '\0');
        assertThat(removeDuplicates(new char[]{'a', 'b', 'a'})).containsExactly('a', 'b', '\0');
        assertThat(removeDuplicates(new char[]{'h', 'e', 'l', 'l', 'o', 'h', 'o', 't'})).containsExactly('h', 'e', 'l', 'o', 't', '\0', 'o', 't');
        assertThat(removeDuplicates(new char[]{'h', 'e', 'l', 'o', 'l'})).containsExactly('h', 'e', 'l', 'o', '\0');
        assertThat(removeDuplicates(new char[]{'h', 'e', 'l', 'o', 'l', 'c', 'o', 't'})).containsExactly('h', 'e', 'l', 'o', 'c', 't', '\0');
    }


}
