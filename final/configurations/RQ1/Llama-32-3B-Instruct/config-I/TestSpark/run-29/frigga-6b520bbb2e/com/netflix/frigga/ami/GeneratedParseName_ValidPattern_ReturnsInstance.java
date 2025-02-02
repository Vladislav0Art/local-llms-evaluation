package com.netflix.frigga.ami;

public class GeneratedParseName_ValidPattern_ReturnsInstance {

    @Test
    public void parseName_ValidPattern_ReturnsInstance() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals("subscriberha", result.getPackageName());
        assertEquals("1.0.0-586499", result.getVersion());
    }

}