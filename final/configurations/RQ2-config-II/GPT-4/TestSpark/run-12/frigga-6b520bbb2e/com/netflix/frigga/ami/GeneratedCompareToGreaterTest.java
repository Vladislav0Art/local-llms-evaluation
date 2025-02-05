package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCompareToGreaterTest {

    @Test
    public void compareToGreaterTest() {
        AppVersion appVersion1 = AppVersion.parseName("MyApp-1.0.0-h2.1234");
        AppVersion appVersion2 = AppVersion.parseName("MyApp-0.9.9-h2.1233");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

}