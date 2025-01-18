package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String appName = "toString1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.toString());
    }

}