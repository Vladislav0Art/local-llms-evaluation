package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ReturnsBuildJobNameTest {

    @Test
    public void getBuildJobName_ReturnsBuildJobNameTest() {
        String buildJobName = "build";
        assertEquals(buildJobName, AppVersion.parseName("0.9.2-0").getBuildJobName());
    }

}