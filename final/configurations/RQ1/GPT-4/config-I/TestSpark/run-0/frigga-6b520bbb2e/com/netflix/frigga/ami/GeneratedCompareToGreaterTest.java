package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToGreaterTest {

    @Test
    public void compareToGreaterTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586500/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

}