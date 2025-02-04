package com.netflix.frigga.ami;

public class GeneratedAppVersionWithInvalidPatternShouldReturnNull {

    @Test
    public void appVersionWithInvalidPatternShouldReturnNull() {
        Matcher matcher = Pattern.compile("[a-z]").matcher("test");
        assertNull(AppVersion.parseName("test"));
    }

}