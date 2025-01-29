package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetPackageVersionPattern {

    @Test
    public void testGetPackageVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("test-ami-name").matches());
        assertFalse(pattern.matcher("another-test-ami-name").matches());
    }

}