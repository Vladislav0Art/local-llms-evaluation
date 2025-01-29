package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestToString {

    private AppVersion appVersion;
    private String mockName;
    private Pattern mockPattern;

    public AppVersionTest() {
        this.appVersion = new AppVersion();
        this.mockName = "";
        this.mockPattern = Pattern.compile("^[a-zA-Z0-9]+$");
    }

    @Test
    public void testToString() {
        String mockName = NameConstants.FRIGGA_AMI_NAME;
        appVersion.parseName(mockName);
        assertEquals("com.netflix.frigga.ami.AppVersion[FRIGGA_AMI_NAME,version=mockName]", appVersion.toString());
    }

}