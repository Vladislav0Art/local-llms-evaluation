package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix:2.1.3:h12.345:b1234:abcdef");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix:2.1.4:h12.345:b1234:abcdef");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}