package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ReturnsExpectedBuildJobName {

    @Test
    public void getBuildJobName_ReturnsExpectedBuildJobName() {
        String buildJobName = "build12345";
        assertEquals(buildJobName, AppVersion.parseName("ami-1234567890").getBuildJobName());
    }

}