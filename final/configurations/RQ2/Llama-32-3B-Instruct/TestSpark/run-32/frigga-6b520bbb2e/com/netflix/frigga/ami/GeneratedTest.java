package com.netflix.frigga.ami;

public class GeneratedTest {

    private String version;

    public AppVersion(String version) {
        this.version = version;
    }

    public static AppVersion fromString(String version) {
        return new AppVersion(version);
    }

    public static AppVersion fromInteger(int version) {
        return new AppVersion(String.valueOf(version));
    }

    public boolean isPositive() {
        return true; // implementation to check if the version is positive
    }

    public boolean isNegative() {
        return false; // implementation to check if the version is negative
    }
}

public class TestAppVersion {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        String amiName = "";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

    @Test
    public void parseName_ValidPattern_ReturnsAppVersion() {
        String amiName = "1.2.3";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
    }

    @Test
    public void parseName_InvalidPattern_ReturnsNull() {
        String amiName = " invalid ";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        String amiName = "";
        String result = AppVersion.parseName(amiName).getPackageName();
        assertEquals("", result);
    }

}