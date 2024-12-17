package com.netflix.frigga.ami;

import java.util.Arrays;

public class GeneratedTestHashCode {

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
    public void testHashCode() {
        AppVersion appVersion = new AppVersion();
        int hashCode = appVersion.hashCode();
        assertEquals(0, hashCode);
    }

}