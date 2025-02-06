package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertEquals("buildJobName", appVersion.getBuildJobName());
    }

}