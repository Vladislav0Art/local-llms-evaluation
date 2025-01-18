package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("name-build1-commit1");
        Assert.assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        Assert.assertNull(appVersion);
    }

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-build1-commit1");
        AppVersion appVersion2 = AppVersion.parseName("name-build1-commit1");
        Assert.assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-build1-commit1");
        AppVersion appVersion2 = AppVersion.parseName("name-build2-commit2");
        Assert.assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Assert.assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("name-build1-commit1");
        Assert.assertEquals("name", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-commit1");
        Assert.assertEquals("version1", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1");
        Assert.assertEquals("build1", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1.1");
        Assert.assertEquals("1", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1.1-commit1");
        Assert.assertEquals("commit1", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1.1-commit1-changelist1");
        Assert.assertEquals("changelist1", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        Assert.assertEquals("AppVersion{name='name', version='version1', amount='build1', commit='commit1', changelist='changelist1'}", appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        Assert.assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsSameInstanceTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        Assert.assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsDifferentInstanceTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        AppVersion appVersion2 = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}