package com.netflix.frigga.ami;

public class GeneratedParseName_validInputReturnsAppVersion {

    @Test
    public void parseName_validInputReturnsAppVersion() {
        AppVersion appVersion = AppVersion.parseName("1.2.3");
        assertNotNull(appVersion);
        assertEquals(123, appVersion.getCommit().hashCode());
    }

}