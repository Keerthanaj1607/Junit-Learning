import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
   public  void testIsPalindrome_true(){
        assertTrue(StringUtils.isPalindrome("madam"));
    }
    @Test
    public void testIsPalindrome_false() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }


    @Test
    public void testReverse_regularWord() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    public void testReverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
   public void testReverse_palindrome() {
        assertEquals("madam", StringUtils.reverse("madam")); // should return same word
    }


}
