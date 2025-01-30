package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest_otherNull {

    @Test
    public void compareToTest_otherNull() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");

        assertEquals(1, appVersion1.compareTo(null));
    }

}