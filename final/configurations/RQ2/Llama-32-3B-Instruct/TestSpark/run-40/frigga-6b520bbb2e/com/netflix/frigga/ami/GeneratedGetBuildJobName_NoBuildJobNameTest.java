package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_NoBuildJobNameTest {

    @Test
    public void getBuildJobName_NoBuildJobNameTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertEquals("", appVersion.getBuildJobName());
    }

}