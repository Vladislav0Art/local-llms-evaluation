package com.netflix.frigga.ami;

public class GeneratedGetVersion_ReturnsExpectedVersion {

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String version = AppVersion.getVersion();
        assertNotNull(version);
        assertTrue(version.matches("\\d+\\.\\d+"));
    }

}