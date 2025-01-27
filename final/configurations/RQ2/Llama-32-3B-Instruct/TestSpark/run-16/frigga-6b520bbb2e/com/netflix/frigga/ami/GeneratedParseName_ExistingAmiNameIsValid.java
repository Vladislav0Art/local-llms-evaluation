package com.netflix.frigga.ami;

public class GeneratedParseName_ExistingAmiNameIsValid {

    @Test
    public void parseName_ExistingAmiNameIsValid() {
        AppVersion appVersion = AppVersion.parseName("ami-1234567890");
        assertNotNull(appVersion);
    }

}