package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentObjectsTest {

    @Test
    public void equalsDifferentObjectsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertTrue(appVersion1.equals(appVersion2));
    }

}