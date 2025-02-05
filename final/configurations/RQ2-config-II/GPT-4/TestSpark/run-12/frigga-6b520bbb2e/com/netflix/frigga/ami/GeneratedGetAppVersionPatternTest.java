package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        String validPatternString = AppVersion.getAppVersionPattern().toString();
        assertTrue(validPatternString.contains("v"));
        assertTrue(validPatternString.contains("b"));
    }

}