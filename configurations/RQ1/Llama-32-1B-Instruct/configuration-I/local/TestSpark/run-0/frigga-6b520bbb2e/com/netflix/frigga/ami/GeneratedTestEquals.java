package com.netflix.frigga.ami;

import java.util.Arrays;

public class GeneratedTestEquals {

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
    public void testEquals() {
        App app1 = new App();
        App app2 = new App();

        // Case 1: Both values are null
        assertTrue(app1.equals(null));
        assertTrue(app2.equals(null));

        // Case 2: Different types
        assertFalse(app1.equals("invalid"));
        assertFalse(app2.equals(123));
    }

}