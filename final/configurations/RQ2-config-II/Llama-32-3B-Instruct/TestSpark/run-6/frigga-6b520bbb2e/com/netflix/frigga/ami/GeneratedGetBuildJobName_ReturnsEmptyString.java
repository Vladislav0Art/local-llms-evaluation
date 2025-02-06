package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetBuildJobName_ReturnsEmptyString {

    @Test
    public void getBuildJobName_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion();
        assertThat(appVersion.getBuildJobName(), is(""));
    }

}