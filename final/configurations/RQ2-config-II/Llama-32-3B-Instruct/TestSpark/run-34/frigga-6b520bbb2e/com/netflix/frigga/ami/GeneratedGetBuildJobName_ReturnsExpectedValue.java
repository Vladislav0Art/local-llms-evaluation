package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetBuildJobName_ReturnsExpectedValue {

    @Test
    public void getBuildJobName_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertEquals("build-job-123456", appVersion.getBuildJobName());
    }

}