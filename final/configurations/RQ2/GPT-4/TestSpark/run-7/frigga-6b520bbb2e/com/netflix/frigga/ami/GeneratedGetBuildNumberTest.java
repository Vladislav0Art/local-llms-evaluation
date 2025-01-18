package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        String buildNumber = "100";
        AppVersion appVersion = AppVersion.parseName(buildNumber);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

}