package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNotNull(appVersion);
    }

    @Test
    public void compareToTest() {
        String amiName = "name1";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        String amiName2 = "name2";
        AppVersion appVersion2 = AppVersion.parseName(amiName2);
        int compare = appVersion1.compareTo(appVersion2);
        Assert.assertTrue(compare != 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String packageName = appVersion.getPackageName();
        Assert.assertNotNull(packageName);
    }

    @Test
    public void getVersionTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String version = appVersion.getVersion();
        Assert.assertNotNull(version);
    }

    @Test
    public void getBuildJobNameTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildJobName = appVersion.getBuildJobName();
        Assert.assertNotNull(buildJobName);
    }

    @Test
    public void getBuildNumberTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildNumber = appVersion.getBuildNumber();
        Assert.assertNotNull(buildNumber);
    }

    @Test
    public void getCommitTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String commit = appVersion.getCommit();
        Assert.assertNotNull(commit);
    }

    @Test
    public void getChangelistTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String changelist = appVersion.getChangelist();
        Assert.assertNotNull(changelist);
    }

    @Test
    public void toStringTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String appVersionStr = appVersion.toString();
        Assert.assertNotNull(appVersionStr);
    }

    @Test
    public void hashCodeTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        int hash = appVersion.hashCode();
        Assert.assertTrue(hash != 0);
    }

    @Test
    public void equalsTest() {
        String amiName = "name1";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        String amiName2 = "name2";
        AppVersion appVersion2 = AppVersion.parseName(amiName2);
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}