package com.netflix.frigga.ami;

public class GeneratedTestParseName_validWithCommit {

    @Test
    public void testParseName_validWithCommit() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499.h150");
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertEquals("h150", parsedName.getCommit());
    }

}