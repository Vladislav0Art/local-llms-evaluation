package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidNameTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertEquals("appName", appVersion.getPackageName());
        assertEquals("version", appVersion.getVersion());
        assertEquals("buildJob", appVersion.getBuildJobName());
        assertEquals("buildNumber", appVersion.getBuildNumber());
        assertEquals("commit", appVersion.getCommit());
    }

}