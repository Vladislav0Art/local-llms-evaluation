package com.netflix.frigga.ami;

public class GeneratedTestNullCommit_ThrowsNullPointerException {

    @Test
    public void testNullCommit_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit(null);
        assertThrows(NullPointerException.class, () -> appVersion.getCommit());
    }

}