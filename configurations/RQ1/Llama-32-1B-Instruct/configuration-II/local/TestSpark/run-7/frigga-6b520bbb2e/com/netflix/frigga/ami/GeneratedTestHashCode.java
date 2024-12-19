package com.netflix.frigga.ami;

public class GeneratedTestHashCode {

    private MockAppVersion mockAppVersion;

    /**
     * Initializes the test fixture.
     */
    @Before
    public void setUp() {
        mockAppVersion = new MockAppVersion();
    }

    /**
     * Tests parsing an appversion tag into its component parts.
     */

    @Test
    public void testHashCode() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals(123, appVersion.hashCode());
    }
}

class MockAppVersion {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;
    private String changelist;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getChangelist() {
        return changelist;
    }

    public void setChangelist(String changelist) {
        this.changelist = changelist;
    }

}