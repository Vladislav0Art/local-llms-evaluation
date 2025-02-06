package com.netflix.frigga.ami;

public class GeneratedToString_ReturnsCorrectStringRepresentationOfAppVersion {

    @Test
    public void toString_ReturnsCorrectStringRepresentationOfAppVersion() {
        String amiName = "my-ami-name-v1.2.3";
        assertEquals("my-ami-name-v1.2.3", AppVersion.parseName(amiName).toString());
    }

}