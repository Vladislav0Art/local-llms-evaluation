package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testGetVersion() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("1.2.3", parsedVersion.getVersion());
    }

}