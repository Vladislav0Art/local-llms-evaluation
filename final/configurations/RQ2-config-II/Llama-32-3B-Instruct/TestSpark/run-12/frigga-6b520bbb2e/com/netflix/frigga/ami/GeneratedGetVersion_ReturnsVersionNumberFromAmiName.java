package com.netflix.frigga.ami;

public class GeneratedGetVersion_ReturnsVersionNumberFromAmiName {

    @Test
    public void getVersion_ReturnsVersionNumberFromAmiName() {
        String amiName = "my-ami-name-v1.2.3";
        assertEquals("v1.2.3", AppVersion.parseName(amiName).getVersion());
    }

}