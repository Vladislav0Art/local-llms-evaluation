package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_NonEmptyString_ReturnsVersion {

    @Test
    public void getVersion_NonEmptyString_ReturnsVersion() {
        String version = "test";
        AppVersion appVersion = new AppVersion(version);
        String result = appVersion.getVersion();
        assertThat(result, is(version));
    }

}