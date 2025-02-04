package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testCheck() {
        Check check = new Check();
        assertTrue(check.check(new String[]{"-h"}));
    }

    @Test
    public void testNoFileSpecified() {
        Check check = new Check();
        assertFalse(check.check(new String[]{}));
    }

}