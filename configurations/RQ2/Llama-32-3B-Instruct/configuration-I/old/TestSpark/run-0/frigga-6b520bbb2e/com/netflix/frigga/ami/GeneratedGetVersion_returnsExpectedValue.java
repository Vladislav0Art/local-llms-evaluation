package com.netflix.frigga.ami;

public class GeneratedGetVersion_returnsExpectedValue {

    @Test
    public void getVersion_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("1.2.3", appVersion.getVersion());
    }

}