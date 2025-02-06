package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetBuildNumber_ReturnsExpectedValue {

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        String amiName = "ami-1234-abcde";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion.getBuildNumber(), is("1234"));
    }

}