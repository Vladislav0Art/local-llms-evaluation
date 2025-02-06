package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_SimpleAppVersion_ReturnsBuildJobName {

    private AppVersion appVersion;

    @Test
    public void getBuildJobName_SimpleAppVersion_ReturnsBuildJobName() {
        appVersion = AppVersion.parseName("ami-1234");
        assertEquals("buildjob-1234", appVersion.getBuildJobName());
    }

}