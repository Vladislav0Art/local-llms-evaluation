package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedParseNameMatchTest {

    @Test
    public void parseNameMatchTest() {
        String appName = "app-1.1.1-build2/WE-APP-app/2";
        AppVersion appVersion = AppVersion.parseName(appName);

        assertEquals("app", appVersion.getPackageName());
        assertEquals("1.1.1", appVersion.getVersion());
        assertEquals("build2", appVersion.getBuildNumber());
        assertEquals("WE-APP-app", appVersion.getBuildJobName());
        assertNull(appVersion.getCommit());
    }

}