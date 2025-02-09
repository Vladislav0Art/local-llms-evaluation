package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        AppVersion appVersion2 = AppVersion.parseName("app-2.5.0-h83.8af1b42");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}