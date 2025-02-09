package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_BuildNumberPresentTest {

    @Test
    public void getBuildNumber_BuildNumberPresentTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertNotNull(appVersion.getBuildNumber());
        assertTrue(appVersion.getBuildNumber().matches("[0-9]+"));
    }

}