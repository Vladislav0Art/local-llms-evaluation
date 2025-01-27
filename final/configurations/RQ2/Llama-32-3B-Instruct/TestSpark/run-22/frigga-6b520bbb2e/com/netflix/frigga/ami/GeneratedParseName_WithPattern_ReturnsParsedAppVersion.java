package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_WithPattern_ReturnsParsedAppVersion {

    @Test
    public void parseName_WithPattern_ReturnsParsedAppVersion() {
        String amiName = "test";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher(amiName);
        matcher.find();
        AppVersion expected = new AppVersion("test");
        assertThat(AppVersion.parseName(amiName), is(expected));
    }

}