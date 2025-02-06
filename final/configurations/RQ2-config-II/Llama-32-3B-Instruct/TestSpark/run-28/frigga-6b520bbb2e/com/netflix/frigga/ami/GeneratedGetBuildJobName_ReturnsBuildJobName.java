package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedGetBuildJobName_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = AppVersion.parseName("1.0-ami-1234567890");
        assertEquals(NameConstants.APP_VERSION_BUILDJOB, appVersion.getBuildJobName());
    }

}