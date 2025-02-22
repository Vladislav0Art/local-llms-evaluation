package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499.h150", parsedName.getCommit());
        assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
        assertEquals("150", parsedName.getBuildNumber());
    }

}