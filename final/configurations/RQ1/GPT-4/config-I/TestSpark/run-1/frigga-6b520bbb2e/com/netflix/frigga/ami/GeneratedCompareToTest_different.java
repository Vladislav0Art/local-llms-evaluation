package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest_different {

    @Test
    public void compareToTest_different() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.1-586499");

        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}