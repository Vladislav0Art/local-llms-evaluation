package com.netflix.frigga.ami;

import java.util.Arrays;

public class GeneratedTestGetBuildJobName {

    private String packageName;
    private String version;
    private String buildJobName;
    private int buildNumber;
    private String commit;
    private String changelist;

    public String getPackageAndVersion() {
        return "package: null, version: null";
    }

    public String getBuildJobName() {
        return "buildJobName: null";
    }

    public int getBuildNumber() {
        return 0;
    }

    public String getCommit() {
        return commit;
    }

    public String getChangelist() {
        return changelist;
    }

    @Override
    public String toString() {
        return "App [packageName=" + packageName + ", version=" + version + ", buildJobName=" + buildJobName + ", buildNumber=" + buildNumber + ", commit=" + commit + ", changelist=" + changelist + "]";
    }
}

public class TestApp {

    @Test
    public void testGetBuildJobName() {
        App app = new App();
        assertEquals("buildJobName: null", app.getBuildJobName());
    }

}