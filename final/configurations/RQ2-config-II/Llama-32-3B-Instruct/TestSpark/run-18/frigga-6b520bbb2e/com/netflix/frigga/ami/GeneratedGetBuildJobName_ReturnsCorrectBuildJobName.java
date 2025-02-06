package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetBuildJobName_ReturnsCorrectBuildJobName {

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getBuildJobName(), is("build-true-job"));
    }

}