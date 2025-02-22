package com.netflix.frigga.ami;

public class GeneratedTestParseName_valid {

    @Test
    public void testParseName_valid() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertNull(parsedName.getCommit());
    }

}