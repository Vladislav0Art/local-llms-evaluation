package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("test");
        assertEquals(appVersion.getVersion(), "");
    }

    @Test
    public void parseNameTest_null() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertEquals(appVersion.getBuildJobName(), "");
    }

    @Test
    public void parseNameTest_empty() {
        AppVersion appVersion = AppVersion.parseName("");
        assertEquals(appVersion.getCommit(), "");
    }

    @Test
    public void parseNameTest_invalid() {
        AppVersion appVersion = AppVersion.parseName("invalid");
        assertEquals(appVersion.getBuildNumber(), "");
    }

    @Test
    public void parseNameTest_valid() {
        AppVersion appVersion = AppVersion.parseName("valid");
        assertEquals(appVersion.getChangelist(), "");
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("test");
        AppVersion appVersion2 = AppVersion.parseName("test");
        int actual = appVersion1.compareTo(appVersion2);
        assertEquals(actual, 0);
    }

    @Test
    public void compareToTest_greater() {
        AppVersion appVersion1 = AppVersion.parseName("test");
        AppVersion appVersion2 = AppVersion.parseName("test2");
        int actual = appVersion1.compareTo(appVersion2);
        assertEquals(actual, -1);
    }

}