package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedCompareToLessThanTest {

    @Test
    public void compareToLessThanTest() {
        AppVersion appVersion1 = AppVersion.parseName("a");
        AppVersion appVersion2 = AppVersion.parseName("b");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}