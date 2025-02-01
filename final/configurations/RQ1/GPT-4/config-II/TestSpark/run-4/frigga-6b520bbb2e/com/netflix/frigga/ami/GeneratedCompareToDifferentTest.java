package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToDifferentTest {

    @Test
    public void compareToDifferentTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.1-h586550");

        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}