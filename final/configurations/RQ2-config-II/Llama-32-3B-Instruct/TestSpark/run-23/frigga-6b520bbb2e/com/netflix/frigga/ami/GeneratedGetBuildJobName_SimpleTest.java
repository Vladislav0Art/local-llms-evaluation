package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_SimpleTest {

    @Test
    public void getBuildJobName_SimpleTest() {
        String buildJobName = AppVersion.getBuildJobName();
        assertNotNull(buildJobName);
        assertTrue(buildJobName.contains("buildjob"));
    }

}