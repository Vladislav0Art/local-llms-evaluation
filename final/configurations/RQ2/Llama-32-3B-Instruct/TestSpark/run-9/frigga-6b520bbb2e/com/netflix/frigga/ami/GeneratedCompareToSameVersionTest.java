package com.netflix.frigga.ami;

public class GeneratedCompareToSameVersionTest {

    @Test
    public void compareToSameVersionTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}