package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedCompareToGreaterThanTest {

    @Test
    public void compareToGreaterThanTest() {
        AppVersion appVersion1 = AppVersion.parseName("b");
        AppVersion appVersion2 = AppVersion.parseName("a");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

}