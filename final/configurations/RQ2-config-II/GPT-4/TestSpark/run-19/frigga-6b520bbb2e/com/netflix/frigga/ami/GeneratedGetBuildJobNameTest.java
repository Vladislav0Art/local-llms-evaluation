package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion-buildJob-testJob");
        assertEquals("testJob", appVersion.getBuildJobName());
    }

}