package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToDifferentAppVersionTest {

    @Test
    public void compareToDifferentAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-586500");
        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}