package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

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
    public void testGetBuildJobName() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals("WE-WAPP-subscriberha/150", appVersion.getBuildJobName());
    }

}