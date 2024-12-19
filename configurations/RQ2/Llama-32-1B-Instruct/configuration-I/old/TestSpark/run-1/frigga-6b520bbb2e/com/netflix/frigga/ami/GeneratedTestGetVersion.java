package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private MockAppVersion mockAppVersion;

    @Before
    public void setup() {
    }

    public AppVersionTest() {
        mockAppVersion = new MockAppVersion();
    }

    @Test
    public void testGetVersion() {
        AppVersion appVersion = mockAppVersion;
        assertEquals("", appVersion.getVersion());
    }

}