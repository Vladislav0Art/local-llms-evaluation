package com.netflix.frigga.ami;

public class GeneratedTestToString {

    private AppVersion appVersion;

    @Test
    public void testToString() {
        appVersion = AppVersion.create("my-app-name");
        String expectedString = "my-app-name";
        assertEquals(expectedString, appVersion.toString());
    }

}