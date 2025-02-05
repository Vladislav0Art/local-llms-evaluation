package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("testApp1-0.0.1");
        AppVersion appVersion2 = AppVersion.parseName("testApp2-0.0.2");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}