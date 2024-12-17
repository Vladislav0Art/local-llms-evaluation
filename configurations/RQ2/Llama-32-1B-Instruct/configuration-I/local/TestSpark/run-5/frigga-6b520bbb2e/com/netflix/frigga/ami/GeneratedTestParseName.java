package com.netflix.frigga.ami;

import java.util.List;

public class GeneratedTestParseName {

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
    public void testParseName() {
        String amiName = "ami-1234567890abcdef";
        AppVersion appVersion = new AppVersion(amiName, "1.2.3");
        assertEquals("ami-1234567890abcdef", appVersion.getPackageName());
        if (appVersion.getVersion().contains(".")) {
            assertEquals("1.2.3", appVersion.getVersion());
        } else {
            assertEquals("build_job_name", appVersion.getBuildJobName());
        }
    }

}