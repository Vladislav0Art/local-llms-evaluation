package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testParseName() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("ami-12345", parsedVersion.getPackageName());
    }

}