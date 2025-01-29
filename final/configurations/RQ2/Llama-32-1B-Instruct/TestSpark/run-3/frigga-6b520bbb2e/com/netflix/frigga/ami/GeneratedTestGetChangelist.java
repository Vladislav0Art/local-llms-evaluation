package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    private AppVersion appVersion;

    @Test
    public void testGetChangelist() {
        appVersion = AppVersion.create("changelist-name");
        assertNotNull(appVersion.getChangelist());
        assertEquals(AppVersion.getChangelist(), appVersion.getChangelist());
    }

}