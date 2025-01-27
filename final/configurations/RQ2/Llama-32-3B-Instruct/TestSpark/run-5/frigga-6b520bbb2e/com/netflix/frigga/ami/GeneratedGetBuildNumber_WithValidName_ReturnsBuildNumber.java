package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_WithValidName_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_WithValidName_ReturnsBuildNumber() {
        String buildNumber = "12345";
        String amiName = "my-ami-" + buildNumber;
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

}