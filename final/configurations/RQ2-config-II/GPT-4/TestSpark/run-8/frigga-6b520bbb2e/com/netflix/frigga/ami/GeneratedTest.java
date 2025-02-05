package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        String amiName = "test-ami";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNotNull(appVersion);
    }

    @Test
    public void parseNameEmptyInputTest() {
        String amiName = "";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion);
    }

    @Test
    public void compareToGreaterTest() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("0.9.0");
        int result = appVersion1.compareTo(appVersion2);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void compareToLessTest() {
        AppVersion appVersion1 = new AppVersion("0.9.0");
        AppVersion appVersion2 = new AppVersion("1.0.0");
        int result = appVersion1.compareTo(appVersion2);
        Assert.assertTrue(result < 0);
    }

    @Test
    public void compareToEqualsTest() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("1.0.0");
        int result = appVersion1.compareTo(appVersion2);
        Assert.assertEquals(0, result);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0");
        Assert.assertEquals("test", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0");
        Assert.assertEquals("1.0.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22");
        Assert.assertEquals("22", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22");
        Assert.assertEquals("22", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22-g123456");
        Assert.assertEquals("g123456", appVersion.getCommit());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22");
        Assert.assertTrue(appVersion.toString().contains(appVersion.getPackageName()));
        Assert.assertTrue(appVersion.toString().contains(appVersion.getVersion()));
        Assert.assertTrue(appVersion.toString().contains(appVersion.getBuildJobName()));
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22");
        Assert.assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22");
        Assert.assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = new AppVersion("test-1.0.0-22");
        AppVersion appVersion2 = new AppVersion("test-1.0.0-23");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}