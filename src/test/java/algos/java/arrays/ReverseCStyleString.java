package algos.java.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseCStyleString {

    public char[] reverse(char[] input) {
        char[] result = input;
        for (int i = 0; i < input.length / 2; i++) {
            char temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        return result;
    }

    public char[] reverse2(char[] input) {
        char[] result = input;
        for (int i = 0, j = input.length - 1; i < j; i++, j--) {
            char temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
        return result;
    }

    @Test
    void reverseString() {
        assertThat(reverse(new char[]{'a'})).containsExactly('a');
        assertThat(reverse(new char[]{'a', 'b'})).containsExactly('b', 'a');
        assertThat(reverse(new char[]{'a', 'b', 'c', 'd'})).containsExactly('d', 'c', 'b', 'a');
        assertThat(reverse(new char[]{})).isEmpty();

        assertThat(reverse2(new char[]{'a'})).containsExactly('a');
        assertThat(reverse2(new char[]{'a', 'b'})).containsExactly('b', 'a');
        assertThat(reverse2(new char[]{'a', 'b', 'c'})).containsExactly('c', 'b', 'a');
        assertThat(reverse2(new char[]{'a', 'b', 'c', 'd'})).containsExactly('d', 'c', 'b', 'a');
        assertThat(reverse2(new char[]{})).isEmpty();
    }

}
