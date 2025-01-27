package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumberZeroTest {

    @Test
    public void getBuildNumberZeroTest() {
        AppVersion appVersion = new AppVersion("0.1.2");
        assertEquals("0", appVersion.getBuildNumber());
    }

}