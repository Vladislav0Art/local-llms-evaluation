package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualAppVersionsTest {

    @Test
    public void compareToEqualAppVersionsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}