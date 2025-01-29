package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildJobName {

    private AppVersion appVersion;

    @Test
    public void testGetBuildJobName() {
        String mockName = "mockBuildJob";
        appVersion.parseName(mockName);
        assertEquals("mockBuildJob", appVersion.getBuildJobName());
    }

}