package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("subscriberha-1.0.0-586499");
        appVersion.setVersion("1.0.0-586499");
        appVersion.setBuildJobName("WE-WAPP-subscriberha/150");
        appVersion.setBuildNumber(null);
        appVersion.setCommit("commit-123");

        AppVersion parsedAppVersion = AppVersion.parseName(appVersion.getAmiName());

        assertEquals("subscriberha-1.0.0-586499", parsedAppVersion.getPackageName());
        assertEquals("1.0.0-586499", parsedAppVersion.getVersion());
        assertEquals(null, parsedAppVersion.getBuildJobName());
        assertEquals("commit-123", parsedAppVersion.getCommit());
    }

    @Test
    public void testParseName_NullAmiName() {
        AppVersion appVersion = new AppVersion();

        assertThrows(NullPointerException.class, () -> appVersion.getPackageName());
    }

    @Test
    public void testNullPackageName_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("");

        assertThrows(NullPointerException.class, () -> appVersion.getPackageName());
    }

    @Test
    public void testParseName_MultipleSpaces() {
        AppVersion appVersion = new AppVersion();

        appVersion.setPackageName("subscriberha-1.0.0-586499 ");
        appVersion.setVersion("1.0.0-586499");
        appVersion.setBuildJobName("WE-WAPP-subscriberha/150");
        appVersion.setBuildNumber(null);
        appVersion.setCommit("commit-123");

        AppVersion parsedAppVersion = AppVersion.parseName(appVersion.getAmiName());

        assertEquals("subscriberha-1.0.0-586499", parsedAppVersion.getPackageName());
        assertEquals("1.0.0-586499", parsedAppVersion.getVersion());
        assertEquals(null, parsedAppVersion.getBuildJobName());
        assertEquals("commit-123", parsedAppVersion.getCommit());
    }

    @Test
    public void testParseName_NullAmiName() {
        AppVersion appVersion = new AppVersion();

        assertThrows(NullPointerException.class, () -> appVersion.getPackageName());
    }

    @Test
    public void testNullAminame_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setAmiName("");

        assertThrows(NullPointerException.class, () -> appVersion.getAmiName());
    }

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();

        assertEquals("AppVersion [packageName=subscriberha-1.0.0-586499 version=1.0.0-586499 buildJobName=null buildNumber=null commit=null]", appVersion.toString());
    }

    @Test
    public void testHashCode() {
        AppVersion appVersion = new AppVersion();

        assertEquals(9, (int) Math.abs(AppVersion.hashCode(appVersion)));
    }

    @Test
    public void testEquals() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        assertFalse(AppVersion.equals(null));
        assertFalse(AppVersion.equals("subscriberha-1.0.0-586499"));
        assertTrue(AppVersion.equals(appVersion1));

        assertFalse(AppVersion.equals(123));
        assertFalse(AppVersion.equals(new Object()));
    }

}