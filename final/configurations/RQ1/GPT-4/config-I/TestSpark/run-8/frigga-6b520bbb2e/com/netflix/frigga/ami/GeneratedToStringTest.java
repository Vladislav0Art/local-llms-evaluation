package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertTrue(appVersion.toString().contains("AppVersion"));
        assertTrue(appVersion.toString().contains(appVersion.getPackageName()));
        assertTrue(appVersion.toString().contains(appVersion.getVersion()));
    }

}