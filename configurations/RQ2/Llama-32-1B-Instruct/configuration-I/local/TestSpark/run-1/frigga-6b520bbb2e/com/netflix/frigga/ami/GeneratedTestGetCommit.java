package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    private MockAppVersion mockAppVersion;

    @Before
    public void setup() {
    }

    public AppVersionTest() {
        mockAppVersion = new MockAppVersion();
    }

    @Test
    public void testGetCommit() {
        AppVersion appVersion = mockAppVersion;
        assertEquals("", appVersion.getCommit());
    }

}