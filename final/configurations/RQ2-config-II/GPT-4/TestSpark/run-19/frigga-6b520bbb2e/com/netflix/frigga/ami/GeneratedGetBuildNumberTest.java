package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion-buildNumber-123");
        assertEquals("123", appVersion.getBuildNumber());
    }

}