package com.netflix.frigga.ami;

import java.util.Arrays;

public class GeneratedTestNull Version {

    public String packageName() {
        return null;
    }

    public String version() {
        return null;
    }

    public String buildJobName() {
        return null;
    }

    public int buildNumber() {
        return 0;
    }

    public String commit() {
        return null;
    }

    public String getChangelist() {
        return null;
    }

    public String buildString() {
        return "null";
    }

    @Override
    public String toString() {
        return "AppVersion [packageName=" + packageName() + ", version=" + version() + ", buildJobName=" + buildJobName() + ", buildNumber=" + buildNumber() + ", changelist=" + getChangelist() + "]";
    }
}

public class TestAppVersion {

    @Test
    public void testNull

    Version() {
        AppVersion appVersion = new AppVersion();
        assertEquals("null", appVersion.version);
    }

}