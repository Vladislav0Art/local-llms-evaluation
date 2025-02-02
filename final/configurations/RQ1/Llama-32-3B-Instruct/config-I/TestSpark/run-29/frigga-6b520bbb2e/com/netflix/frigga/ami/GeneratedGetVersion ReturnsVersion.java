package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetVersion ReturnsVersion {

    @Test
    public void getVersion

    ReturnsVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion result = AppVersion.parseName(amiName);
        assertEquals("1.0.0-586499", result.getVersion());
    }

}