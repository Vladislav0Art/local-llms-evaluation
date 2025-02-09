package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals(name, appVersion.toString());
    }

    @Test
    public void parseNameNullNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);

        Assert.assertNull(appVersion);
    }

    @Test
    public void compareToSmallerThanOtherTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-1.0.0-rc.1-h1.abc12");
        AppVersion appVersion2 = AppVersion.parseName("name-2.0.0-rc.1-h1.abc12");

        Assert.assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void compareToEqualToOtherTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-1.0.0-rc.1-h1.abc12");
        AppVersion appVersion2 = AppVersion.parseName("name-1.0.0-rc.1-h1.abc12");

        Assert.assertTrue(appVersion1.compareTo(appVersion2) == 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();

        Assert.assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals("name", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals("1.0.0-rc.1", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals("h1", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals("abc12", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals("abc12", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals("abc12", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals(name, appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);
        AppVersion sameAppVersion = AppVersion.parseName(name);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals(appVersion.hashCode(), sameAppVersion.hashCode());
    }

    @Test
    public void equalsSameAppVersionTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);
        AppVersion sameAppVersion = AppVersion.parseName(name);

        Assert.assertTrue(appVersion.equals(sameAppVersion));
    }

    @Test
    public void equalsDifferentAppVersionTest() {
        String name1 = "name-1.0.0-rc.1-h1.abc12";
        String name2 = "name-1.0.0-rc.1-h2.abc12";
        AppVersion appVersion1 = AppVersion.parseName(name1);
        AppVersion appVersion2 = AppVersion.parseName(name2);

        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsNullAppVersionTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertFalse(appVersion.equals(null));
    }

}