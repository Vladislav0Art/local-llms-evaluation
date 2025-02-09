package com.netflix.frigga.ami;

public class GeneratedTestNull {

    private String version;

    public AppVersion() {
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
    public void testNull() {
        AppVersion appVersion = null;

        assertThrows(NullPointerException.class, () -> appVersion.equals(null));
    }

}