package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-ami-name"));
        assertEquals("test-ami-name", appVersion.toString());
    }

}