package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetBuildNumber ReturnsBuildNumber {

    @Test
    public void getBuildNumber

    ReturnsBuildNumber() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion result = AppVersion.parseName(amiName);
        assertEquals("586499", result.getBuildNumber());
    }

}