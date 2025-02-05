package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals("packageName", result.getPackageName());
        Assert.assertEquals("1.0.0", result.getVersion());
        Assert.assertEquals("12", result.getBuildNumber());
        Assert.assertEquals("abcdefg", result.getCommit());
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(pattern);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-1.0.0-h12.abcdefg");
        AppVersion appVersion2 = AppVersion.parseName("packageName-1.0.0-h13.abcdefg");
        Assert.assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getPackageNameTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals("packageName", result.getPackageName());
    }

    @Test
    public void getVersionTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals("1.0.0", result.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertNull(result.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals("12", result.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals("abcdefg", result.getCommit());
    }

    @Test
    public void getChangelistTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertNull(result.getChangelist());
    }

    @Test
    public void toStringTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals(amiName, result.toString());
    }

    @Test
    public void hashCodeTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals(result.hashCode(), result.hashCode());
    }

    @Test
    public void equalsTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertTrue(result.equals(result));
    }

    @Test
    public void equalsFailTest() {
        String amiName1 = "packageName-1.0.0-h12.abcdefg";
        AppVersion result1 = AppVersion.parseName(amiName1);
        String amiName2 = "packageName-2.0.0-h13.hijklmn";
        AppVersion result2 = AppVersion.parseName(amiName2);
        Assert.assertFalse(result1.equals(result2));
    }

}