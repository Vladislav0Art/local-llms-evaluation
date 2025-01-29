package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetVersion {

    private AppVersion appVersion;

    @Test
    public void testGetVersion() {
        String mockName = NameConstants.FRIGGA_AMI_NAME;
        appVersion.parseName(mockName);
        assertEquals(mockName, appVersion.getVersion());
    }

}