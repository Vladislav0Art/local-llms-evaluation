package com.netflix.frigga.ami;

public class GeneratedParseName_WithInvalidAmpiName_ReturnsNull {

    @Test
    public void parseName_WithInvalidAmpiName_ReturnsNull() {
        // given
        String amiName = "invalid";
        // when
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        // then
        Assert.assertNull(parsedAppVersion);
    }

}