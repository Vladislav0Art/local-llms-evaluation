package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String amiName = "testAmiName";
        assertNotNull(appVersion.parseName(amiName));
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();
        assertEquals(0, appVersion.compareTo(other));
    }

    @Test
    public void getAppVersionPatternTest() {
        AppVersion appVersion = new AppVersion();
        Pattern pattern = appVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.toString());
    }

}