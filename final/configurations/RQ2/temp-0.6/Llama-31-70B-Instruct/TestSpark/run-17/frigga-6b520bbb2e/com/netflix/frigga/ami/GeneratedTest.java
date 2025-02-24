package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertNotNull(appVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion otherAppVersion = new AppVersion();
        int result = appVersion.compareTo(otherAppVersion);
        assertNotNull(result);
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

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = new AppVersion();
        String changelist = appVersion.getChangelist();
        assertNotNull(changelist);
    }

}