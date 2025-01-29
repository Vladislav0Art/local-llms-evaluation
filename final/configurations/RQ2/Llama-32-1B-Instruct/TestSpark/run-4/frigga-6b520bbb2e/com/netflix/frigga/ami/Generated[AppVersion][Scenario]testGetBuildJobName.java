package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testGetBuildJobName {

    @Test
    public void [AppVersion][Scenario]testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("build-job-123");
        Assert.assertEquals("build-job-123", appVersion.getBuildJobName());
    }

}