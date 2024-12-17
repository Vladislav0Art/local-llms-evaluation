package com.netflix.frigga.ami;

public class GeneratedTestParseName_MultipleSpaces {

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

}