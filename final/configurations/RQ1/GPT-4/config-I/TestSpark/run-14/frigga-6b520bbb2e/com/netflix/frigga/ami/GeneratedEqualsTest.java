package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersionOne = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersionTwo = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertTrue(appVersionOne.equals(appVersionTwo));
    }

}