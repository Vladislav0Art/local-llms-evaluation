package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("h150", parsedName.getBuildNumber());
        assertEquals("WE-WAPP-subscriberha/150", parsedName.getBuildJobName());
        assertEquals("586499", parsedName.getCommit());
    }

}