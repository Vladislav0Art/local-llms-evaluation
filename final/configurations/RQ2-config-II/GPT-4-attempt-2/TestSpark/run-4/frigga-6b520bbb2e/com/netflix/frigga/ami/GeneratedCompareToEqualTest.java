package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App1-v1.0");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}