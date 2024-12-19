package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private MockAppVersion mockAppVersion;

    @Before
    public void setup() {
    }

    public AppVersionTest() {
        mockAppVersion = new MockAppVersion();
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = mockAppVersion;
        assertEquals("", appVersion.getPackageName());
    }

}