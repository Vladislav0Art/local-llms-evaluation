package com.netflix.frigga.ami;

public class GeneratedEmptyAppVersionShouldReturnNull {

    @Test
    public void emptyAppVersionShouldReturnNull() {
        AppVersion appVersion = AppVersion.parseName("");
        assertNull(appVersion);
    }

}