package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.package-1.0.0-h0.abc123");
        assertEquals("h0", appVersion.getBuildJobName());
    }

}