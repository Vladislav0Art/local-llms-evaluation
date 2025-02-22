package com.netflix.frigga.ami;

public class GeneratedTestParseName_validWithBuildJob {

    @Test
    public void testParseName_validWithBuildJob() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertEquals("h150", parsedName.getCommit());
        assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
    }

}