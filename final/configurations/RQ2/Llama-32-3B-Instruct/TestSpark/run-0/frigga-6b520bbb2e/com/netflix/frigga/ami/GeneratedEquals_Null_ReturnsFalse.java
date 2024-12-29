package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_Null_ReturnsFalse {

    @Test
    public void equals_Null_ReturnsFalse() {
        AppVersion first = new AppVersion("test-version-1", "build-job-name-1", 1234567890L, "abcdefg");
        assertNull(first.equals(null));
    }
}

public class MockAppVersion {

    private String packageName;
    private String version;
    private String buildJobName;
    private Long buildNumber;
    private String commit;

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public void setBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

}