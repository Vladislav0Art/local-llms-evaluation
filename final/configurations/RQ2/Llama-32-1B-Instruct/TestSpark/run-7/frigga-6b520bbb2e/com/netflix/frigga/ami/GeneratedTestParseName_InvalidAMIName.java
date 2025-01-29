package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseName_InvalidAMIName {

    @Test
    public void testParseName_InvalidAMIName() {
        String amiName = "";
        try {
            AppVersion.parseName(amiName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}