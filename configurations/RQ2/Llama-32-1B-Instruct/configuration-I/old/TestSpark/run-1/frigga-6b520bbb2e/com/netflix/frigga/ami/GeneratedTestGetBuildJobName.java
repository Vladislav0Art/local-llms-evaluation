package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private MockAppVersion mockAppVersion;

    @Before
    public void setup() {
    }

    public AppVersionTest() {
        mockAppVersion = new MockAppVersion();
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = mockAppVersion;
        assertEquals("", appVersion.getBuildJobName());
    }

}