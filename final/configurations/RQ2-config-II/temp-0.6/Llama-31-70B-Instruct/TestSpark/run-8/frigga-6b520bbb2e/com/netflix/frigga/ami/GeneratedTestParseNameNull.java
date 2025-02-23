package com.netflix.frigga.ami;

public class GeneratedTestParseNameNull {

    @Test
    public void testParseNameNull() {
        String amiName = null;
        AppVersion parsedName = AppVersion.parseName(amiName);
        Assert.assertNull(parsedName);
    }

}