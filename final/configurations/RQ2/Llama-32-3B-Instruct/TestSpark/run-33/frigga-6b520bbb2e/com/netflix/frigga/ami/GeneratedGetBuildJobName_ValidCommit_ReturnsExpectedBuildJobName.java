package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ValidCommit_ReturnsExpectedBuildJobName {

    @Test
    public void getBuildJobName_ValidCommit_ReturnsExpectedBuildJobName() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        String expectedBuildJobName = "ec2";
        assertEquals(expectedBuildJobName, appVersion.getBuildJobName());
    }

}