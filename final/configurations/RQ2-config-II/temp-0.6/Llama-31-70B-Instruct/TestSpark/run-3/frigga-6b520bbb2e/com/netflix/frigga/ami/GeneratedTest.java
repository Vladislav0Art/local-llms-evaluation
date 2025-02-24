package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "ami-name";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result >= -1 && result <= 1);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern result = AppVersion.getAppVersionPattern();
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

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getChangelist();
        assertNotNull(result);
    }

}