package com.netflix.frigga.ami;

public class GeneratedConstructAppVersionWithOnlyId {

    @Test
    public void constructAppVersionWithOnlyId() {
        String amiId = "123456789012345678901234567890";
        AppVersion appVersion = new AppVersion(amiId, null, null);
        assertEquals(amiId, appVersion.getId());
    }

}