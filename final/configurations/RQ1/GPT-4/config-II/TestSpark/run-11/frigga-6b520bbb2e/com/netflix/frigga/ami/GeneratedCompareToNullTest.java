package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456");

        assertTrue(appVersion.compareTo(null) == 1);
    }

}