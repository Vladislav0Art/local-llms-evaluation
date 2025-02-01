package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        String app1 = "subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150";
        String app2 = "subscriberha-1.0.0-h586500.h150/WE-WAPP-subscriberha/150";
        AppVersion appVer1 = AppVersion.parseName(app1);
        AppVersion appVer2 = AppVersion.parseName(app2);

        assertTrue(appVer1.compareTo(appVer2) < 0);
        assertTrue(appVer2.compareTo(appVer1) > 0);
        assertEquals(appVer1.compareTo(appVer1), 0);
    }

}