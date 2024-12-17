package com.netflix.frigga.ami;

public class GeneratedTestGetBuilder {

    private static AppVersion appVersion1 = new AppVersion();
    private static AppVersion appVersion2 = new AppVersion();

    @Test
    public void testGetBuilder() throws Exception {
        assertEquals("rpm", getAppVersion().getBuilder().getPackageName());
    }

}