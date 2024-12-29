package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();
        int result = appVersion.compareTo(other);
        assertTrue(result >= -1 && result <= 1);
    }

}