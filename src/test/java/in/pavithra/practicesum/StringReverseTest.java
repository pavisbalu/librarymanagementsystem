package in.pavithra.practicesum;

import org.junit.Test;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringReverseTest
{
@Test
    public  void shouldReverseWordsInSentence(){
    String actual=StringReverse.reverseString("I Love You");
    assertThat(actual,is("You Love I"));

}



}