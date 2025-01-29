package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion;

    @Test
    public void testGetPackageName() {
        appVersion = new AppVersion();
        appVersion.getPackageName() = "mockPackage";
        assertEquals("mockPackage", appVersion.getPackageName());
    }

}