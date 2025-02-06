package com.netflix.frigga.ami;

public class GeneratedEquals_TwoAppVersionsWithSameAmiNameAndBuildNumber_ReturnsTrue {

    @Test
    public void equals_TwoAppVersionsWithSameAmiNameAndBuildNumber_ReturnsTrue() {
        String amiName = "my-ami-name-v1.2.3";
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion(amiName);
        assertTrue(appVersion1.equals(appVersion2));
    }

}