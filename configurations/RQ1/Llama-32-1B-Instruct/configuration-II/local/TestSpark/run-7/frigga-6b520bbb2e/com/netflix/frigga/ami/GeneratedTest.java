package com.netflix.frigga.ami;

public class GeneratedTest {

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
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.packageName);
        assertEquals("1.0.0", parsedName.version);
        assertNotNull(parsedName.buildJobName);
    }

    @Test
    public void testParseNameWithBuildString() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.packageName);
        assertEquals("1.0.0", parsedName.version);
        assertNotNull(parsedName.buildJobName);
    }

    @Test
    public void testCompareVersions() {
        AppVersion appVersion1 = new MockAppVersion();
        AppVersion appVersion2 = new MockAppVersion();

        appVersion1.setBuildNumber("1234");
        appVersion2.setBuildNumber("5678");

        assertTrue(AppVersion.compareVersions(appVersion1, appVersion2));
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals("WE-WAPP-subscriberha/150", appVersion.getBuildJobName());
    }

    @Test
    public void testGetCommitHash() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150", appVersion.getChangelist());
    }

    @Test
    public void testGetChangeList() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150", appVersion.getChangelist());
    }

    @Test
    public void testToString() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0-586499.h150/WE-WAPP-subscriberha/150]", appVersion.toString());
    }

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