package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReversingThePalindromeStringTest extends checkpalindrome {
    ReversingThePalindromeString reversingthepalindromestring;


    @Before
    public void setUp() throws Exception {
        reversingthepalindromestring = new ReversingThePalindromeString();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void emptyStringTest() throws Exception {
        Boolean expectedValue = true;

        Boolean actualValue = reversingthepalindromestring.checkPalindrome("");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void multipleWhiteSpaceTest() throws Exception {

        Boolean actualValue = reversingthepalindromestring.checkPalindrome("madam");
        assertTrue(actualValue);


    }
}

