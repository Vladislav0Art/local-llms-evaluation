package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testGetBuildJobName() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("build-job-name", parsedVersion.getBuildJobName());
    }

}