package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        String appName = "number1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getBuildNumber());
    }

}