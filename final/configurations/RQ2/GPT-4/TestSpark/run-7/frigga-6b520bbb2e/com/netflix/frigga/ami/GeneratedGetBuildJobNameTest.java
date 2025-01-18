package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        String buildJobName = "myJob";
        AppVersion appVersion = AppVersion.parseName(buildJobName);
        assertEquals(buildJobName, appVersion.getBuildJobName());
    }

}