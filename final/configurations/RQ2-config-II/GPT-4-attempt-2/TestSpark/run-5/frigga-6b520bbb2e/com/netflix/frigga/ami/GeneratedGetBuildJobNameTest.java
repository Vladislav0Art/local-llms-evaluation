package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("h82", appVersion.getBuildJobName());
    }

}