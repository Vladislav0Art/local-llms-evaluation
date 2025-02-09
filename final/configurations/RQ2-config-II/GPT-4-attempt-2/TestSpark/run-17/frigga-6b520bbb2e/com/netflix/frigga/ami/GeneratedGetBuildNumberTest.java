package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("testName");
        assertNotNull(appVersion.getBuildNumber());
    }

}