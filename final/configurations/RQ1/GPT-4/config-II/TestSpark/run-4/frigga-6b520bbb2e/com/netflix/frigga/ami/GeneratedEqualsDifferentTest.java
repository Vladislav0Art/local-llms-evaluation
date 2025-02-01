package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentTest {

    @Test
    public void equalsDifferentTest() {
        AppVersion parsedAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion parsedAppVersion2 = AppVersion.parseName("subscriberha-1.0.1-h586499");

        assertFalse(parsedAppVersion1.equals(parsedAppVersion2));
    }

}