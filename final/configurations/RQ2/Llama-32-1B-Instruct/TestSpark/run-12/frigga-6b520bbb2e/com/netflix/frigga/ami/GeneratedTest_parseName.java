package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_parseName {

    @Test
    public void test_parseName() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        Matcher matcher = Pattern.compile("([A-Z]+)(.*)").matcher(appVersion.getPackage());
        assertEquals(1, matcher.findIndex());
        assertEquals("ami", matcher.group(1));
        assertEquals("abc123", matcher.group(2));
    }

}