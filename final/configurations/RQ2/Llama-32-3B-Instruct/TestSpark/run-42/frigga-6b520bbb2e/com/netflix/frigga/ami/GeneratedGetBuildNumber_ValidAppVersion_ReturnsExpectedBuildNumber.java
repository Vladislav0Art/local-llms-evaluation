package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildNumber_ValidAppVersion_ReturnsExpectedBuildNumber {

    @Test
    public void getBuildNumber_ValidAppVersion_ReturnsExpectedBuildNumber() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("123456", buildNumber);
    }

}