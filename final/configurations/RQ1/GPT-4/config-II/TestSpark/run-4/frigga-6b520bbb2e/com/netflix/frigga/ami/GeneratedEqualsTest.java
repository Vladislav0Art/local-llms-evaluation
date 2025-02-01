package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion parsedAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion parsedAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertTrue(parsedAppVersion1.equals(parsedAppVersion2));
    }

}