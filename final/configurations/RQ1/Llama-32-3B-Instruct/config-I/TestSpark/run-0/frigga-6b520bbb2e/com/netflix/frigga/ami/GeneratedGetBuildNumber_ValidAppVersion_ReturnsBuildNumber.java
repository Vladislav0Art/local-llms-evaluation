package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildNumber_ValidAppVersion_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ValidAppVersion_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildNumber = "1234567890";
        assertEquals("1234567890", appVersion.getBuildNumber());
    }

}