package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-ami-name"));
        assertEquals("test-ami-name", appVersion.getPackageName());
    }

}