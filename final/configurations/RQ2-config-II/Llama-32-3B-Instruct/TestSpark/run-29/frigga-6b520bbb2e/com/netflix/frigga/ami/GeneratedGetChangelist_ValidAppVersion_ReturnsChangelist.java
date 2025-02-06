package com.netflix.frigga.ami;

public class GeneratedGetChangelist_ValidAppVersion_ReturnsChangelist {

    @Test
    public void getChangelist_ValidAppVersion_ReturnsChangelist() {
        AppVersion appVersion = new AppVersion("1.2.3-1234567890");
        assertNotNull(appVersion.getChangelist()); // Note: This method is deprecated and should not be used.
    }

}