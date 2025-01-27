package com.netflix.frigga.ami;

public class GeneratedCompareToDifferentVersionTest {

    @Test
    public void compareToDifferentVersionTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("4.5.6");
        assertEquals(1, appVersion1.compareTo(appVersion2));
    }

}