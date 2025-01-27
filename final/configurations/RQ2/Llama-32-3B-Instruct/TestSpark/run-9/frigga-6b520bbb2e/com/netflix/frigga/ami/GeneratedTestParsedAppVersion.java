package com.netflix.frigga.ami;

public class GeneratedTestParsedAppVersion {

    private String version;
    private String commit;

    public AppVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
}

public class NameConstants {
    public static final String APP_VERSION_PACKAGE = "com.netflix.frigga.ami";
}

public class GeneratedTest {

    @Test
    public void testParsedAppVersion() {
        AppVersion appVersion1 = new AppVersion("1.2.3");
        assertEquals("1.2.3", appVersion1.getVersion());
        assertNull(appVersion1.getCommit());

        AppVersion appVersion2 = new AppVersion("4.5.6");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}