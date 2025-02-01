package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseNameValidAppNameTest() {
        String validAppName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(validAppName);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals("subscriberha", appVersion.getPackageName());
        Assert.assertEquals("1.0.0", appVersion.getVersion());
        Assert.assertEquals("586499", appVersion.getBuildNumber());
        Assert.assertEquals("h150", appVersion.getCommit());
        Assert.assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

    @Test
    public void parseNameInvalidAppNameTest() {
        String invalidAppName = "invalidAppName";
        AppVersion appVersion = AppVersion.parseName(invalidAppName);

        Assert.assertNull(appVersion);
    }

    @Test
    public void parseNameNullAppNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);

        Assert.assertNull(appVersion);
    }

    @Test
    public void compareToSelfTest() {
        String appName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appName);

        Assert.assertEquals(0, appVersion.compareTo(appVersion));
    }

    @Test
    public void compareToNullTest() {
        String appName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appName);

        Assert.assertEquals(1, appVersion.compareTo(null));
    }

    @Test
    public void compareToOtherTest() {
        String appName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String appName2 = "subscriberha-1.0.1-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion1 = AppVersion.parseName(appName1);
        AppVersion appVersion2 = AppVersion.parseName(appName2);

        Assert.assertEquals(1, appVersion1.compareTo(appVersion2));
        Assert.assertEquals(-1, appVersion2.compareTo(appVersion1));
    }

    @Test
    public void toStringTest() {
        String appName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appName);
        String result = appVersion.toString();

        Assert.assertTrue(result.contains("AppVersion"));
        Assert.assertTrue(result.contains("packageName=subscriberha"));
        Assert.assertTrue(result.contains(", version=1.0.0"));
        Assert.assertTrue(result.contains(", buildJobName=WE-WAPP-subscriberha"));
        Assert.assertTrue(result.contains(", buildNumber=586499"));
        Assert.assertTrue(result.contains(", changelist=h150"));
        Assert.assertTrue(result.contains("]"));
    }

    @Test
    public void testEqualsSameObject() {
        String validAppName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(validAppName);

        Assert.assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void testEqualsDifferentType() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");

        Assert.assertFalse(appVersion.equals("just a string"));
    }

    @Test
    public void getAppVersionPatternTest() {
        Assert.assertNotNull(AppVersion.getAppVersionPattern());
    }

}