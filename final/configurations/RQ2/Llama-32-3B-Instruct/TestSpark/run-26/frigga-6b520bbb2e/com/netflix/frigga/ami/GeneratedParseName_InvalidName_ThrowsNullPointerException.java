package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_InvalidName_ThrowsNullPointerException {

    @Test
    public void parseName_InvalidName_ThrowsNullPointerException() {
        String amiName = null;
        try {
            AppVersion.parseName(amiName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals(e, null);
        }
    }

}