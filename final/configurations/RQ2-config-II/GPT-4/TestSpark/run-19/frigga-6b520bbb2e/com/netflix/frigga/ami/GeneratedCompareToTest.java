package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}