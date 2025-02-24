package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "ami-123456";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        String packageName = appVersion.getPackageName();
        assertNotNull(packageName);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        String version = appVersion.getVersion();
        assertNotNull(version);
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        String buildJobName = appVersion.getBuildJobName();
        assertNotNull(buildJobName);
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = new AppVersion();
        String buildNumber = appVersion.getBuildNumber();
        assertNotNull(buildNumber);
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

}