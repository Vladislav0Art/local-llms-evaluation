package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion otherAppVersion = new AppVersion();
        int result = appVersion.compareTo(otherAppVersion);
        assertNotNull(result);
    }

}