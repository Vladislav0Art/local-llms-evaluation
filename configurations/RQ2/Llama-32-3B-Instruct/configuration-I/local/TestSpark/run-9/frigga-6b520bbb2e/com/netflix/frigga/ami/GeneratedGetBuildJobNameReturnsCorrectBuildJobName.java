package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;

public class GeneratedGetBuildJobNameReturnsCorrectBuildJobName {

    @Test
    public void getBuildJobNameReturnsCorrectBuildJobName() {
        AppVersion appVersion = new AppVersion("1.0-2.0");
        String buildJobName = "test";
        assertThat(buildJobName, is(appVersion.getBuildJobName()));
        // Test implementation
    }

}