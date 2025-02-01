package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getBuildNumber());
    }

}