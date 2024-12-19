package com.netflix.frigga.ami;

public class GeneratedGetPackageNameturnsNullIfNoPackageName {

    private final static Matcher matcher = AppVersion.APP_VERSION_PATTERN.matcher("subscriberha-1.0.0-586499");

    @Test
    public void getPackageNameturnsNullIfNoPackageName() {
        // Given: amiName is ""
        AppVersion parsedName = new AppVersion();
        assertNull(parsedName.getPackageName());
    }

}