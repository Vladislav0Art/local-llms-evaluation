package com.netflix.frigga.ami;

public class GeneratedInvalidAppVersionPatternShouldReturnNull {

    @Test
    public void invalidAppVersionPatternShouldReturnNull() {
        Matcher matcher = Pattern.compile("").matcher("test");
        assertNull(AppVersion.parseName("test"));
    }

}