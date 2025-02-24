package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToTest {

    // Testing the parseName method

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result >= -1 && result <= 1);
    }

}