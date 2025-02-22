package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("h150");
        assertEquals("h150", appVersion.getCommit());
    }

}