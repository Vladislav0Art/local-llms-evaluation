package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareToTest_greater {

    @Test
    public void compareToTest_greater() {
        AppVersion appVersion1 = AppVersion.parseName("test");
        AppVersion appVersion2 = AppVersion.parseName("test2");
        int actual = appVersion1.compareTo(appVersion2);
        assertEquals(actual, -1);
    }

}