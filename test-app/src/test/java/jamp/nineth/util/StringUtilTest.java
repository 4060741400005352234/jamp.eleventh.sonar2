package jamp.nineth.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for StringUtil
 * @author Yevgeniy Popov
 */
public class StringUtilTest {

    @Test
    public void getReverseStringShouldReturnReversedString() throws Exception {
        String expected = "olleH";

        String revString = StringUtil.getReverseString("Hello");

        assertEquals("String are not equals.", expected, revString);
    }

    @Test
    public void getReverseStringShouldNotReturnNullForCorrectParameter() throws Exception {
        String source = "Hello";

        String result = StringUtil.getReverseString(source);

        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getReverseStringShouldThrowExceptionForEmptyString() throws Exception {
        StringUtil.getReverseString("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getReverseStringShouldThrowExceptionForNullString() throws Exception {
        StringUtil.getReverseString(null);
    }

    @Test
    public void isEmptyShouldReturnTrueForNullString() throws Exception {
        boolean result = StringUtil.isEmpty(null);

        assertTrue("Incorrect result.", result);
    }

    @Test
    public void isEmptyShouldReturnTrueForEmptyString() throws Exception {
        String source = "";

        boolean result = StringUtil.isEmpty(source);

        assertTrue("Incorrect result.", result);
    }

    @Test
    public void isEmptyShouldReturnFalseForString() throws Exception {
        String source = "Hello";

        boolean result = StringUtil.isEmpty(source);

        assertFalse("Incorrect result.", result);
    }
}