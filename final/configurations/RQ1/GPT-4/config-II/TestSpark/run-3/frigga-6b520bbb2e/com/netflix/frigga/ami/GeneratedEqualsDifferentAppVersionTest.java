package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentAppVersionTest {

    @Test
    public void equalsDifferentAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499.150/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586500.151/WE-WAPP-subscriberha2/151");
        assertFalse(appVersion1.equals(appVersion2));
    }

}