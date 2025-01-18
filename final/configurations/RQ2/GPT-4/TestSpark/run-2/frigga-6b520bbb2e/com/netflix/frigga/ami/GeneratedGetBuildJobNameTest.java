package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        String appName = "job1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getBuildJobName());
    }

}