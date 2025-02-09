package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ValidAminame_ReturnsExpectedString {

    @Test
    public void toString_ValidAminame_ReturnsExpectedString() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        String expectedString = "AppVersion{packageName=com.amazonaws.ec2, version=0.9.1, buildJobName=ec2, buildNumber=1, commit=ec2}";
        assertEquals(expectedString, appVersion.toString());
    }

}