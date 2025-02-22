package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertNull(parsedName.getBuildJobName());
        assertNull(parsedName.getBuildNumber());
        assertNull(parsedName.getCommit());
    }

}