package com.netflix.frigga.ami;

public class GeneratedTest {

    private String version;
    private int buildNumber;
    private String commitHash;

    public AppVersion(String version, int buildNumber, String commitHash) {
        this.version = version;
        this.buildNumber = buildNumber;
        this.commitHash = commitHash;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }
}

public class TestAppVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion1 = new AppVersion("1.9.2", 123, "commit-1");
        AppVersion appVersion2 = new AppVersion("1.8.2", 456, "commit-2");

        assertEquals("1.9.2", appVersion1.getVersion());
        assertEquals("1.8.2", appVersion2.getVersion());
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion("1.9.2", 123, "commit-1");

        assertEquals(123, appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommitHash() {
        AppVersion appVersion = new AppVersion("1.9.2", 123, "commit-1");

        assertEquals("commit-1", appVersion.getCommitHash());
    }

    @Test
    public void testConstructAppVersion() {
        AppVersion appVersion = new AppVersion("1.9.2", 123, "commit-1");

        assertNotNull(appVersion);
        assertEquals(3, appVersion.getVersion().split("\\.").length);
        assertTrue(appVersion.getBuildNumber() > 0);
        assertTrue(appVersion.getCommitHash().matches("[a-zA-Z0-9]+"));
    }

}