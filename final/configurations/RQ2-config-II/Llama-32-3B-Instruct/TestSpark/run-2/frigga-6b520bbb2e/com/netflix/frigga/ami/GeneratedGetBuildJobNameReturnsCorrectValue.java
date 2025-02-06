package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobNameReturnsCorrectValue {

    @Test
    public void getBuildJobNameReturnsCorrectValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("build123");
        assertEquals("build123", appVersion.getBuildJobName());
    }

}