package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetBuildNumber_ReturnsExpectedValue {

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertEquals("123456", appVersion.getBuildNumber());
    }

}