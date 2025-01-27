package com.netflix.frigga.ami;

public class GeneratedTestGetCommitHash {

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
    public void testGetCommitHash() {
        AppVersion appVersion = new AppVersion("1.9.2", 123, "commit-1");

        assertEquals("commit-1", appVersion.getCommitHash());
    }

}