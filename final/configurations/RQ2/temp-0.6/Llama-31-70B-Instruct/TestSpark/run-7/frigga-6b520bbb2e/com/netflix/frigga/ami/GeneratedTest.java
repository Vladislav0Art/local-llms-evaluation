package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String amiName = "testAmiName";
        AppVersion result = appVersion.parseName(amiName);
        assertNotNull(result);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = Mockito.mock(AppVersion.class);
        int result = appVersion.compareTo(other);
        assertNotEquals(0, result);
    }

    @Test
    public void getAppVersionPatternTest() {
        AppVersion appVersion = new AppVersion();
        Pattern result = appVersion.getAppVersionPattern();
        assertNotNull(result);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getPackageName();
        assertNotNull(result);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getVersion();
        assertNotNull(result);
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getBuildJobName();
        assertNotNull(result);
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getBuildNumber();
        assertNotNull(result);
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getCommit();
        assertNotNull(result);
    }

}