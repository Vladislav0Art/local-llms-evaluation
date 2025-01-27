package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetBuildJobName_ReturnsCorrectString {

    @Test
    public void getBuildJobName_ReturnsCorrectString() {
        String buildJobName = "123";
        AppVersion appVersion = new AppVersion();
        assertEquals(buildJobName, appVersion.getBuildJobName());
    }

}