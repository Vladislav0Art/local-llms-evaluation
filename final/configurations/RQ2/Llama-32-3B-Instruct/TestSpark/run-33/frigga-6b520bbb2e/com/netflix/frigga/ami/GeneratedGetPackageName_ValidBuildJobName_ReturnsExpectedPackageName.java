package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ValidBuildJobName_ReturnsExpectedPackageName {

    @Test
    public void getPackageName_ValidBuildJobName_ReturnsExpectedPackageName() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        String expectedPackageName = "com.amazonaws.ec2";
        assertEquals(expectedPackageName, appVersion.getPackageName());
    }

}