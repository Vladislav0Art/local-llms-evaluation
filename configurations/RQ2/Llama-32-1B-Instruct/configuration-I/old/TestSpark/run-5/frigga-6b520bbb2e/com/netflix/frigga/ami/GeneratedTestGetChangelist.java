package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        String amiName = "ami-1234567890abcdef";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("", appVersion.getChangelist());
    }

}