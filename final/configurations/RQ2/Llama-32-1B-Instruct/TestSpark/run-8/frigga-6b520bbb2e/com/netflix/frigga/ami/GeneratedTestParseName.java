package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName {

    private AppVersion appVersion;

    @Test
    public void testParseName() {
        String mockName = "mockPackage";
        appVersion.parseName(mockName);
        Matcher matcher = Pattern.compile("^\\w+").matcher(appVersion.getVersion());
        assertEquals("mockPackage", matcher.find() ? appVersion.getVersion() : null);
    }

}