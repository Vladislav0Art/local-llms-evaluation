package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildNumber {

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-build-number"));
        assertEquals("test-build-number", appVersion.getBuildNumber());
    }

}