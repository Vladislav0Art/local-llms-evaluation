package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

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
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion("1.2.3");
        assertEquals(NameConstants.APP_VERSION_PACKAGE, appVersion.getPackageName());
    }

}