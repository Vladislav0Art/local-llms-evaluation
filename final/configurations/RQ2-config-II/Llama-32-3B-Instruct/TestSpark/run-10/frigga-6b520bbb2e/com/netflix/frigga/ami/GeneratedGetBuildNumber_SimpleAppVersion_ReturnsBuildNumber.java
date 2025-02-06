package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_SimpleAppVersion_ReturnsBuildNumber {

    private AppVersion appVersion;

    @Test
    public void getBuildNumber_SimpleAppVersion_ReturnsBuildNumber() {
        appVersion = AppVersion.parseName("ami-1234");
        assertEquals("1234", appVersion.getBuildNumber());
    }

}