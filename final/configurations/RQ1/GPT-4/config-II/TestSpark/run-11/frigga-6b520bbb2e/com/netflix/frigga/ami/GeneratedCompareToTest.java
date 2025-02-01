package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("appname-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("appname-1.0.0-h123456");

        assertTrue(appVersion1.compareTo(appVersion2) == 0);
    }

}