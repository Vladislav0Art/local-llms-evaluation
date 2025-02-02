package com.netflix.frigga.ami;

public class GeneratedTestParsedName {

    @Test
    public void testParsedName() {
        AppVersion parsedName = AppVersion.parseName("subscriberha/1.0.0-586499");
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0-586499", parsedName.getVersion());
    }

}