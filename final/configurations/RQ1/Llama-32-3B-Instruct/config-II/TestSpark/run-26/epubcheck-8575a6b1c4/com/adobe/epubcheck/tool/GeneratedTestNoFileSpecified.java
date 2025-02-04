package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNoFileSpecified {

    @Test
    public void testNoFileSpecified() {
        Check check = new Check();
        assertFalse(check.check(new String[]{}));
    }

}