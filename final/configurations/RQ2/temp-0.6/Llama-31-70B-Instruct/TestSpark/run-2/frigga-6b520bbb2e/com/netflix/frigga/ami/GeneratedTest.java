package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String amiName = "test";
        AppVersion actual = appVersion.parseName(amiName);
        assertNotNull(actual);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int actual = appVersion1.compareTo(appVersion2);
        assertEquals(0, actual);
    }

    @Test
    public void appVersionPatternTest() {
        AppVersion appVersion = new AppVersion();
        Pattern actual = appVersion.getAppVersionPattern();
        assertNotNull(actual);
    }

    @Test
    public void packageNameTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getPackageName();
        assertNotNull(actual);
    }

    @Test
    public void versionTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getVersion();
        assertNotNull(actual);
    }

    @Test
    public void buildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getBuildJobName();
        assertNotNull(actual);
    }

    @Test
    public void buildNumberTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getBuildNumber();
        assertNotNull(actual);
    }

    @Test
    public void commitTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getCommit();
        assertNotNull(actual);
    }

}