package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private static String amiName;

    @Test
    public void TestGetBuildNumber() {
        when(parseName.amiName()).thenReturn("build1");
        assertEquals("build1", appVersion.getBuildNumber());
    }

}