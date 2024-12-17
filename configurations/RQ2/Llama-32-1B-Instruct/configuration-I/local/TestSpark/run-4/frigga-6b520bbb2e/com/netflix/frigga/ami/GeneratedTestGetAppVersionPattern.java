package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern {

    private static String amiName;

    @Test
    public void TestGetAppVersionPattern() {
        when(pattern.matches(" ami.*:.* "));
        verifyNoInteractions(pattern);
    }

}