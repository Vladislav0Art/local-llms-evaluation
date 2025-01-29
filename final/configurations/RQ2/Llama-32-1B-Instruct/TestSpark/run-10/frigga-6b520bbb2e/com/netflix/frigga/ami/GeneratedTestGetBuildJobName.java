package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-build-job-name"));
        assertEquals("test-build-job-name", appVersion.getBuildJobName());
    }

}