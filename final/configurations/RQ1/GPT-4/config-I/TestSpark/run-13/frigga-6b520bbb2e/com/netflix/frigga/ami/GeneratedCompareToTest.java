package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion validAppVersion1 = AppVersion.parseName("subscriberha-2.0.0-h150/WE-WAPP-subscriberha/150");
        AppVersion validAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertTrue(validAppVersion1.compareTo(validAppVersion2) > 0);
    }

}