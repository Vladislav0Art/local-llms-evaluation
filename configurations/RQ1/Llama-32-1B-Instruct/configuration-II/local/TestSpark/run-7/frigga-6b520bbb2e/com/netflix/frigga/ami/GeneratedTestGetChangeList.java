package com.netflix.frigga.ami;

public class GeneratedTestGetChangeList {

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
    public void testGetChangeList() {
        AppVersion appVersion = new MockAppVersion();
        assertEquals("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150", appVersion.getChangelist());
    }

}