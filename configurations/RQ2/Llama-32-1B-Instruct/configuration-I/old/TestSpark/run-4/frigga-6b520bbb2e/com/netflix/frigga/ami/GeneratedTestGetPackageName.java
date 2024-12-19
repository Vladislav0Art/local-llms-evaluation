package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private static String amiName;

    @Test
    public void TestGetPackageName() {
        when(parseName.amiName()).thenReturn("package1");
        assertEquals("package1", appVersion.getPackageName());
    }

}