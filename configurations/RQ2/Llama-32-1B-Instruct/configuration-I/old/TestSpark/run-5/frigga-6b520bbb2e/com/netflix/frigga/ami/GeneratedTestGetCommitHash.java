package com.netflix.frigga.ami;

import java.util.List;

public class GeneratedTestGetCommitHash {

    private String packageName;
    private String version;
    private String buildJobName;
    private String commitHash;

    public AppVersion(String packageName, String version) {
        this.packageName = packageName;
        this.version = version;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    @Override
    public String toString() {
        return "AppVersion{" +
                "packageName='" + packageName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

public class AppVersionTest {

    @Test
    public void testGetCommitHash() {
        String amiName = "ami-1234567890abcdef";
        AppVersion appVersion = new AppVersion(amiName, "1.2.3");
        assertEquals("", appVersion.getCommitHash());
    }

}