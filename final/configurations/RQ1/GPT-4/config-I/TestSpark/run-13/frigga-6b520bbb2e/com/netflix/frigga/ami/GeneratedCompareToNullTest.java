package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertTrue(validAppVersion.compareTo(null) > 0);
    }

}