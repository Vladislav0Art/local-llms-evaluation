package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        String validPattern = "subscriberha-1.0.0-h586499";
        AppVersion appVersion1 = AppVersion.parseName(validPattern);
        AppVersion appVersion2 = AppVersion.parseName(validPattern);

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}