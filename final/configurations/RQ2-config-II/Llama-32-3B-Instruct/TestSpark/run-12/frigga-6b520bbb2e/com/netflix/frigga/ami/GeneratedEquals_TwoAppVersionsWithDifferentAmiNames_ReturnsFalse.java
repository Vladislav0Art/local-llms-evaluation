package com.netflix.frigga.ami;

public class GeneratedEquals_TwoAppVersionsWithDifferentAmiNames_ReturnsFalse {

    @Test
    public void equals_TwoAppVersionsWithDifferentAmiNames_ReturnsFalse() {
        String amiName1 = "my-ami-name-v1.2.3";
        String amiName2 = "other-ami-name-v1.2.4";
        AppVersion appVersion1 = new AppVersion(amiName1);
        AppVersion appVersion2 = new AppVersion(amiName2);
        assertFalse(appVersion1.equals(appVersion2));
    }

}