package com.netflix.frigga.ami;

public class GeneratedTestNotEquals {

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
    public void testNotEquals() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("0.9.1-EC2-X86_64-GP2");
        AppVersion anotherAppVersion = new AppVersion();
        anotherAppVersion.setVersion("0.10.0-EC2-X86_64-GP2");

        assertFalse(appVersion.equals(anotherAppVersion));
    }

}