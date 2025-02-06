package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetPackageName_ReturnsCorrectName {

    @Test
    public void getPackageName_ReturnsCorrectName() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getPackageName(), is("com.netflix.frigga.ami"));
    }

}