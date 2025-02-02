package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppVersion {

    private String packageName = "subscriberha";
    private String version = "1.0.0-586499";
    private String buildNumber = null;
    private String commit = null;

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersion() {
        return this.version;
    }

    public String getBuildNumber() {
        return this.buildNumber;
    }

    public String getCommit() {
        return this.commit;
    }
}

public class GeneratedTest {

    @Test
    public void testAppVersion() {
        AppVersion result = new AppVersion();
        assertNotNull(result);
        assertEquals(packageName, result.getPackageName());
        assertEquals(version, result.getVersion());
        assertNull(result.getBuildNumber());
        assertNull(result.getCommit());

        result.setBuildNumber("123456");
        result.setCommit("abc123");

        assertTrue(result.getBuildNumber() != null);
        assertTrue(result.getCommit() != null);

        assertEquals(packageName, result.getPackageName());
        assertEquals(version, result.getVersion());
    }

    public void setPackage(String packageName) {
        this.packageName = packageName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

}