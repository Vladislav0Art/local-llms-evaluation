package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseNameCorrectNameTest {

    @Test
    public void parseNameCorrectNameTest() {
        String correctName = "MyApp-1.0.0-h2.12345678";
        AppVersion appVersion = AppVersion.parseName(correctName);
        assertEquals("MyApp", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("h2", appVersion.getBuildJobName());
        assertEquals("12345678", appVersion.getBuildNumber());
    }

}