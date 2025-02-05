package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        AppVersion appVersion2 = AppVersion.parseName("baseos-packagebase-0.0.6-h14.18141516");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}