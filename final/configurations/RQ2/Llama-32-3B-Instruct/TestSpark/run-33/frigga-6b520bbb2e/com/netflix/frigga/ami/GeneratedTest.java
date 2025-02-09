package com.netflix.frigga.ami;

public class GeneratedTest {

    private String version;

    public AppVersion(String version) {
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean equals(AppVersion other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        AppVersion appVersion = (AppVersion) other;
        return Objects.equals(version, appVersion.version);
    }
}

public class GeneratedTest {

    @Test
    public void parseName_ValidAminame_ReturnsAppVersion() {
        String amiName = "0.9.1-EC2-X86_64-GP2";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_InvalidAminame_ThrowsNullPointerException() {
        String amiName = "";
        assertThrows(NullPointerException.class, () -> AppVersion.parseName(amiName));
    }

    @Test
    public void getAppVersionPattern_ValidPattern_ReturnsExpectedPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        String expectedPattern = "^[0-9]+\\.[0-9]+(-[a-z]+-x\\w+)-(\\w+)\\-[a-z]+$";
        assertEquals(expectedPattern, pattern.pattern());
    }

}