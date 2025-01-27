package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetBuildNumber_ReturnsCorrectBuildNumber {

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        String buildNumber = new AppVersion().getBuildNumber();
        assertEquals("", buildNumber);
    }

}