package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetBuildNumber {

    @Test
    public void TestGetBuildNumber() {
        String amiName = "AmazonLinux 2 x86_64 AMI";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("build-number", appVersion.getBuildNumber());
    }

}