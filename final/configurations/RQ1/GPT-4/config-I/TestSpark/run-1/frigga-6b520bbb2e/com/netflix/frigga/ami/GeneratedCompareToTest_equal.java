package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest_equal {

    @Test
    public void compareToTest_equal() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-586499");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}