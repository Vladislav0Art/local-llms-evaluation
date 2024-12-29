package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String testName = "amiName";
        AppVersion out = AppVersion.parseName(testName);
        Assert.assertNotNull(out);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("appVersion1");
        AppVersion appVersion2 = AppVersion.parseName("appVersion2");
        int out = appVersion1.compareTo(appVersion2);
        Assert.assertNotEquals(0, out);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        String packageName = appVersion.getPackageName();
        Assert.assertNotNull(packageName);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        String version = appVersion.getVersion();
        Assert.assertNotNull(version);
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        String buildJobName = appVersion.getBuildJobName();
        Assert.assertNotNull(buildJobName);
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        String buildNumber = appVersion.getBuildNumber();
        Assert.assertNotNull(buildNumber);
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        String commit = appVersion.getCommit();
        Assert.assertNotNull(commit);
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        String changelist = appVersion.getChangelist();
        Assert.assertNotNull(changelist);
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        String out = appVersion.toString();
        Assert.assertNotNull(out);
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        int out = appVersion.hashCode();
        Assert.assertNotEquals(0, out);
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        AppVersion sameAppVersion = appVersion;
        Assert.assertTrue(appVersion.equals(sameAppVersion));
        AppVersion differentAppVersion = AppVersion.parseName("differentAmiName");
        Assert.assertFalse(appVersion.equals(differentAppVersion));
    }

}