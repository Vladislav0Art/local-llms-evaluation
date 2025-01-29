package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    private AppVersion appVersion;

    @Test
    public void testGetCommit() {
        appVersion = AppVersion.create("commit-abcde");
        assertNotNull(appVersion.getCommit());
        assertEquals(AppVersion.getCommit(), appVersion.getCommit());
    }

}