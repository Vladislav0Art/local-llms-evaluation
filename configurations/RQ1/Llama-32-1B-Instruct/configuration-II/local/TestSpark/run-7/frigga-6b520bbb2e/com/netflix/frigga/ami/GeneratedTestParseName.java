package com.netflix.frigga.ami;

public class GeneratedTestParseName {

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

}