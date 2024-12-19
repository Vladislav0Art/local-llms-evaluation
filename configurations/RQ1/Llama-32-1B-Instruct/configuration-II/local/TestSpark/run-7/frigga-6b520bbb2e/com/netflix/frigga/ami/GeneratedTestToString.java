package com.netflix.frigga.ami;

public class GeneratedTestToString {

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
    public void testToString() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0-586499.h150/WE-WAPP-subscriberha/150]", appVersion.toString());
    }

}