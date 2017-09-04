package in.pavithra.practicesum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void shouldReverseWordsInASentence() {
        String actual = ReverseString.reverseWords
                ("I love pavithra");
        assertThat(actual, is("pavithra love I"));
    }
}