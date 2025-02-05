package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("MyApp-1.0.0-h1.1234");
        AppVersion appVersion2 = AppVersion.parseName("MyApp-1.0.0-h1.1234");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}