package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedCompareToEqualToTest {

    @Test
    public void compareToEqualToTest() {
        AppVersion appVersion1 = AppVersion.parseName("a");
        AppVersion appVersion2 = AppVersion.parseName("a");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}