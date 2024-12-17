package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private MockAppVersion mockAppVersion;

    @Before
    public void setup() {
    }

    public AppVersionTest() {
        mockAppVersion = new MockAppVersion();
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = mockAppVersion;
        assertEquals("", appVersion.getBuildNumber());
    }

}