package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        Assert.assertEquals("subscriberha", parsedName.getPackageName());
        Assert.assertEquals("1.0.0", parsedName.getVersion());
        Assert.assertEquals("h150", parsedName.getCommit());
        Assert.assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
        Assert.assertEquals("150", parsedName.getBuildNumber());
    }

    @Test
    public void testParseNameNull() {
        String amiName = null;
        AppVersion parsedName = AppVersion.parseName(amiName);
        Assert.assertNull(parsedName);
    }

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "subscriberha";
        appVersion1.version = "1.0.0";
        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "subscriberha";
        appVersion2.version = "1.0.0";
        int comparison = appVersion1.compareTo(appVersion2);
        Assert.assertEquals(0, comparison);
    }

    @Test
    public void testCompareToDifferentPackageName() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "subscriberha";
        appVersion1.version = "1.0.0";
        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "subscriberha2";
        appVersion2.version = "1.0.0";
        int comparison = appVersion1.compareTo(appVersion2);
        Assert.assertEquals(-1, comparison);
    }

}