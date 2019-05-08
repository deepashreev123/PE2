package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenNumberTest extends checkpalindrome {
    EvenNumber evennumber;

    @Before
    public void setUp() throws Exception {
        evennumber = new EvenNumber();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkIntegerIsEven() {
        boolean actualValue = evennumber.checkNumberIsEven(6);
        assertTrue(actualValue);
    }

    @Test
    public void checkIntegerIsOdd() {
        boolean actualValue = evennumber.checkNumberIsEven(17);
        assertFalse(actualValue);
    }
}

