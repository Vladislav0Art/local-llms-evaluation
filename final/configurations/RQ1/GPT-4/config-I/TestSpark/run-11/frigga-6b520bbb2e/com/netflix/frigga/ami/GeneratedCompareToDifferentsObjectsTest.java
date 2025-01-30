package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedCompareToDifferentsObjectsTest {

    @Test
    public void compareToDifferentsObjectsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586500");

        // AppVersion1 build number is less than AppVersion2, so compareTo should return a negative value
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}