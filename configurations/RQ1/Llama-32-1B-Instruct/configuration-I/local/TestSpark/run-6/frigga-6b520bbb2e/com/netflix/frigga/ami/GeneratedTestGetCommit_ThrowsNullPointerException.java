package com.netflix.frigga.ami;

public class GeneratedTestGetCommit_ThrowsNullPointerException {

    @Test
    public void testGetCommit_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.getCommit();

        assertThrows(NullPointerException.class, () -> appVersion.getCommit());
    }

}