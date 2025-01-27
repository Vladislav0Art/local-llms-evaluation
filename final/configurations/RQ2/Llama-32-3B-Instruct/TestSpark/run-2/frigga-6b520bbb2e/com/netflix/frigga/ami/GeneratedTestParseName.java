package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        AppVersion appVersion = AppVersion.parseName("1.0.0-1234567890");
        assertNotNull(appVersion);
        assertEquals(AppVersion.APP_VERSION, appVersion.getPackage());
        assertEquals(AppVersion.APP_VERSION, appVersion.getVersion());
        assertEquals("build-job-" + AppVersion.APP_VERSION, appVersion.getBuildJobName());
        assertEquals(AppVersion.APP_VERSION.split("-")[0], appVersion.getBuildNumber());
        assertEquals(AppVersion.APP_VERSION.split("-")[1].split("\\.")[0], appVersion.getCommit());
    }

}