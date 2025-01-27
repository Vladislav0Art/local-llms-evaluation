package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_EmptyString_ThrowsNullPointerException {

    @Test
    public void parseName_EmptyString_ThrowsNullPointerException() {
        String amiName = "";
        try {
            AppVersion.parseName(amiName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals(e, null);
        }
    }

}