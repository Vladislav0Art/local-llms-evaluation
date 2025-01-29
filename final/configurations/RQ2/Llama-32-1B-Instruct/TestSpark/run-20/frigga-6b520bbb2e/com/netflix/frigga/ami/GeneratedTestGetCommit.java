package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testGetCommit() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("commit", parsedVersion.getCommit());
    }

}