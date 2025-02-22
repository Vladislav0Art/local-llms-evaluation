package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName_null() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

    @Test
    public void testParseName_valid() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertNull(parsedName.getCommit());
    }

    @Test
    public void testParseName_validWithCommit() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499.h150");
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertEquals("h150", parsedName.getCommit());
    }

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