package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_EmptyString_ReturnsEmptyString {

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        String packageName = "";
        String version = "test";
        AppVersion appVersion = new AppVersion(version);
        String result = appVersion.getPackageName();
        assertThat(result, is(""));
    }

}