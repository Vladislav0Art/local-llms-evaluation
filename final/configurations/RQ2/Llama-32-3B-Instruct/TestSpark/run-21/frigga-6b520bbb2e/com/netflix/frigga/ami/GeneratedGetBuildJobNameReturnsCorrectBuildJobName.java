package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobNameReturnsCorrectBuildJobName {

    @Test
    public void getBuildJobNameReturnsCorrectBuildJobName() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals("build-1234567890", appVersion.getBuildJobName());
    }

}