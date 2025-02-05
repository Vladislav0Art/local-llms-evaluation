package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("buildJobName");
        assertEquals("buildJobName", appVersion.getBuildJobName());
    }

}