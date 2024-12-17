package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;

public class GeneratedGetBuildNumberReturnsCorrectBuildNumber {

    @Test
    public void getBuildNumberReturnsCorrectBuildNumber() {
        AppVersion appVersion = new AppVersion("1.0-2.0");
        String buildNumber = "12345";
        assertThat(buildNumber, is(appVersion.getBuildNumber()));
        // Test implementation
    }

}