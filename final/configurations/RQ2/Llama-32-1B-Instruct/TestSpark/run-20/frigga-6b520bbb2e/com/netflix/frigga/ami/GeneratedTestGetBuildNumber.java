package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testGetBuildNumber() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("1234", parsedVersion.getBuildNumber());
    }

}