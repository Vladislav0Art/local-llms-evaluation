package com.netflix.frigga.ami;

public class GeneratedGetPackageName_returnsPackageName {

    private final static Matcher matcher = AppVersion.APP_VERSION_PATTERN.matcher("subscriberha-1.0.0-586499");

    @Test
    public void getPackageName_returnsPackageName() {
        // Given: amiName is "subscriberha-1.0.0-586499"
        AppVersion parsedName = new AppVersion();
        parsedName.packageName = "subscriberha";
        assertEquals("subscriberha", parsedName.getPackageName());
    }

}