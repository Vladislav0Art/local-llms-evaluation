package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_WithoutPattern_ReturnsNull {

    @Test
    public void parseName_WithoutPattern_ReturnsNull() {
        String amiName = "test";
        Pattern pattern = AppVersion.getAppVersionPattern();
        assert pattern != null;
        Matcher matcher = pattern.matcher(amiName);
        matcher.find();
        assertThat(AppVersion.parseName(amiName), is(null));
    }

}