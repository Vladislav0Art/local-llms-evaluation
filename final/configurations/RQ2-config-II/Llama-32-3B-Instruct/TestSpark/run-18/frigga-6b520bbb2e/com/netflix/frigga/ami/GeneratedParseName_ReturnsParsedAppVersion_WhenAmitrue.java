package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedParseName_ReturnsParsedAppVersion_WhenAmitrue {

    @Test
    public void parseName_ReturnsParsedAppVersion_WhenAmitrue() {
        String amiName = "ami-true";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion, is(AppVersion.THRUE));
    }

}