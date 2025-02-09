package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("appVersionName");
        Assert.assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        Assert.assertNull(appVersion);
    }

    @Test
    public void compareToEqualVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("version1");
        AppVersion appVersion2 = AppVersion.parseName("version1");
        Assert.assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("com.package.version");
        Assert.assertEquals("com.package", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("com.package.version");
        Assert.assertEquals("version", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("job.build.version");
        Assert.assertEquals("job.build", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("job.build.number");
        Assert.assertEquals("number", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("commit.commitHash");
        Assert.assertEquals("commitHash", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("changelist.changelistHash");
        Assert.assertEquals("changelistHash", appVersion.getChangelist());
    }

    @Test
    public void toStringValidVersionTest() {
        AppVersion appVersion = AppVersion.parseName("version.toString");
        Assert.assertEquals("version.toString", appVersion.toString());
    }

    @Test
    public void hashCodeValidVersionTest() {
        AppVersion appVersion = AppVersion.parseName("version.hashCode");
        Assert.assertNotEquals(0, appVersion.hashCode());
    }

    @Test
    public void equalsEqualVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("version1");
        AppVersion appVersion2 = AppVersion.parseName("version1");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsNotEqualVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("version1");
        AppVersion appVersion2 = AppVersion.parseName("version2");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}