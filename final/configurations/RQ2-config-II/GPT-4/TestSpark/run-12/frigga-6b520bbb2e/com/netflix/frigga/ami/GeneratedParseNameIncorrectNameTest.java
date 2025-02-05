package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseNameIncorrectNameTest {

    @Test
    public void parseNameIncorrectNameTest() {
        String incorrectName = "MyApp-1.0.0";
        AppVersion appVersion = AppVersion.parseName(incorrectName);
        assertEquals("", appVersion.getPackageName());
        assertEquals("", appVersion.getVersion());
        assertEquals("", appVersion.getBuildJobName());
        assertEquals("", appVersion.getBuildNumber());
    }

}