package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobNameEmptyStringReturnsBlankTest {

    @Test
    public void getBuildJobNameEmptyStringReturnsBlankTest() {
        AppVersion appVersion = new AppVersion("", "");
        assertEquals("", appVersion.getBuildJobName());
    }

}