package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildNumber_ReturnsExpectedValue {

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion("1.0");
        assertEquals("4567", appVersion.getBuildNumber());
    }

}