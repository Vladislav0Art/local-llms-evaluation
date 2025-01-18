package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("app-buildNumber");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("buildNumber", buildNumber);
    }

}