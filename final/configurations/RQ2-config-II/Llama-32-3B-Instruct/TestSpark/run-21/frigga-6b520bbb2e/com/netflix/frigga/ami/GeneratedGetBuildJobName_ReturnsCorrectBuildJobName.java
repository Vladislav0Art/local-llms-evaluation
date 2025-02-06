package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ReturnsCorrectBuildJobName {

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        String buildJobName = AppVersion.getBuildJobName();
        assertNotNull(buildJobName);
        assertEquals("buildJobName", buildJobName);
    }

}