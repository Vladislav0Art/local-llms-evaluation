package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testGetPackageName() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("ami", parsedVersion.getPackageName());
    }

}