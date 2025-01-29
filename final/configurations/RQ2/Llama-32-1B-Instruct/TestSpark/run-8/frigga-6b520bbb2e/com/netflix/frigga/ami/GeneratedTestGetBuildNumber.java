package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion;

    @Test
    public void testGetBuildNumber() {
        String mockName = NameConstants.FRIGGA_AMI_NAME;
        appVersion.parseName(mockName);
        assertEquals(0, appVersion.getBuildNumber());
    }

}