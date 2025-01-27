package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetBuildJobName_ReturnsExpectedValue {

    @Test
    public void getBuildJobName_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("havana", buildJobName);
    }

}