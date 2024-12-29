package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildNumber_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion("1234567890");
        assertEquals(123456789, Long.parseLong(appVersion.getBuildNumber()));
    }

}