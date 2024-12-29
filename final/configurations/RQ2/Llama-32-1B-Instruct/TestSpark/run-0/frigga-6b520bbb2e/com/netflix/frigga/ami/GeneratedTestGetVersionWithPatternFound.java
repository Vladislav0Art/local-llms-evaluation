package com.netflix.frigga.ami;

public class GeneratedTestGetVersionWithPatternFound {

    private AppVersion appVersion;

    @Test
    public void testGetVersionWithPatternFound() {
        String pattern = "pattern-name";
        appVersion = new AppVersion();
        assertEquals("pattern-name", appVersion.getVersion());
    }

}