package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCheck {

    @Test
    public void testCheck() {
        Check check = new Check();
        assertTrue(check.check(new String[]{"-h"}));
    }

}