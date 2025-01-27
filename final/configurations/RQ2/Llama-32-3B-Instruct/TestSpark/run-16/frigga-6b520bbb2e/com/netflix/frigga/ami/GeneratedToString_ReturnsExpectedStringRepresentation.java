package com.netflix.frigga.ami;

public class GeneratedToString_ReturnsExpectedStringRepresentation {

    @Test
    public void toString_ReturnsExpectedStringRepresentation() {
        String expected = "build1, version1";
        AppVersion appVersion = new AppVersion("build1", "version1");
        assertEquals(expected, appVersion.toString());
    }

}