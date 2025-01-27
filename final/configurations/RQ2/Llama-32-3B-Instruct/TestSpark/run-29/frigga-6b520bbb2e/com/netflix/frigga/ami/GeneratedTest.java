package com.netflix.frigga.ami;

public class GeneratedTest {

    private AppVersion appVersion;

    public AppVersionWrapper(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public AppVersion getAppVersion() {
        return appVersion;
    }
}

public class AppVersion {
    // No-arg constructor to make it accessible for testing
    public AppVersion() {
    }
}

public class GeneratedTest {

    @Test
    public void parseName_EmptyString_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.parseName(""));
    }

    @Test
    public void parseName_ValidAminame_ReturnsAppVersionObject() {
        String amiName = "1.0-123";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(amiName, appVersion.getVersion());
    }

    @Test
    public void parseName_InvalidAminame_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.parseName("123"));
    }

    @Test
    public void getAppVersionPattern_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.getAppVersionPattern());
    }

}