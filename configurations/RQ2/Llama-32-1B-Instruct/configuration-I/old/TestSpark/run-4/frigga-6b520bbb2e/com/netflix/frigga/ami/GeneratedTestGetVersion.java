package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private static String amiName;

    @Test
    public void TestGetVersion() {
        when(parseName.amiName()).thenReturn("version1");
        assertEquals("version1", appVersion.getVersion());
    }

}