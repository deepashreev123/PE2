package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class PowerOfNumberTest extends checkpalindrome {
    PowerOfNumber powerofnumber;

    @Before
    public void setUp() throws Exception {
        powerofnumber = new PowerOfNumber();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEmptyPower() throws Exception {
        boolean expectedValue = true;
        boolean actualValue = PowerOfNumber.getDisplay(16);
    }


    @Test

    public void testinvalidPower() throws Exception {
        boolean expectedValue = true;
        boolean actaulValue = PowerOfNumber.getDisplay(44);
        assertNotEquals(expectedValue, actaulValue);

    }
}