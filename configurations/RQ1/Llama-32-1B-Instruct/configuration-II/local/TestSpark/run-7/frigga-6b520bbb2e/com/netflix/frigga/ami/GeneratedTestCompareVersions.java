package com.netflix.frigga.ami;

public class GeneratedTestCompareVersions {

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
    public void testCompareVersions() {
        AppVersion appVersion1 = new MockAppVersion();
        AppVersion appVersion2 = new MockAppVersion();

        appVersion1.setBuildNumber("1234");
        appVersion2.setBuildNumber("5678");

        assertTrue(AppVersion.compareVersions(appVersion1, appVersion2));
    }

}