package com.netflix.frigga.ami;

public class GeneratedTestNullAminame_ThrowsNullPointerException {

    @Test
    public void testNullAminame_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setAmiName("");

        assertThrows(NullPointerException.class, () -> appVersion.getAmiName());
    }

}