package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertNull(parsedName.getBuildJobName());
        assertNull(parsedName.getBuildNumber());
        assertNull(parsedName.getCommit());
    }

    @Test
    public void testParseNameWithNull() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

    @Test
    public void testParseNameWithInvalidPattern() {
        String amiName = "invalid";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "subscriberha";
        appVersion1.version = "1.0.0";
        appVersion1.buildJobName = "job1";
        appVersion1.buildNumber = "1";
        appVersion1.commit = "123";

        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "subscriberha";
        appVersion2.version = "1.0.0";
        appVersion2.buildJobName = "job1";
        appVersion2.buildNumber = "1";
        appVersion2.commit = "123";

        int comparison = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparison);
    }

}