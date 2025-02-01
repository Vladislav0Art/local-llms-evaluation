package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualToSelfTest {

    @Test
    public void compareToEqualToSelfTest() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(0, appVersion.compareTo(appVersion));
    }

}