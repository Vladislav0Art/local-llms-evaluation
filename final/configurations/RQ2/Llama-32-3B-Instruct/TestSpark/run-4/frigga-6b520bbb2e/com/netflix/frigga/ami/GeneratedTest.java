package com.netflix.frigga.ami;

public class GeneratedTest {

    private String amiId;
    private String packageName;
    private String commit;
    private String buildNumber;

    public AppVersion(String amiId, String packageName, String commit) {
        this.amiId = amiId;
        this.packageName = packageName;
        this.commit = commit;
        this.buildNumber = null;
    }

    public String getId() {
        return amiId;
    }

    public void setId(String id) {
        this.amiId = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }
}

public class AppVersionTest {

    @Test
    public void testAppVersion() {
        AppVersion appVersion = new AppVersion("ami-id", "package-name", "commit");
        assertNotNull(appVersion);
        assertEquals("ami-id", appVersion.getId());
        assertEquals("package-name", appVersion.getPackageName());
        assertEquals("commit", appVersion.getCommit());
        assertNull(appVersion.getBuildNumber());

        appVersion.setBuildNumber("build-number");
        assertEquals("build-number", appVersion.getBuildNumber());
    }
}

}