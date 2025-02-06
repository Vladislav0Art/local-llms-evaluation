package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedGetBuildNumber_nullTest {

    @Test
    public void getBuildNumber_nullTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getBuildNumber());
    }

}