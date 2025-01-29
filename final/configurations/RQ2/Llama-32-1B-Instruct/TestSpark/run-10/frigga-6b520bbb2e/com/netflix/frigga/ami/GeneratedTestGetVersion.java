package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-ami-version"));
        assertEquals("test-ami-version", appVersion.getVersion());
    }

}