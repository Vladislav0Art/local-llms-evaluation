package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("subscriberha");
        assertEquals("subscriberha", appVersion.getPackageName());
    }

}