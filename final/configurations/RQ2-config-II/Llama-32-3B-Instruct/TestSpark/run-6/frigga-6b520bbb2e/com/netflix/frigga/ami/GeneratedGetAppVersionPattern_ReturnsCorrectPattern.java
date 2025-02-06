package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetAppVersionPattern_ReturnsCorrectPattern {

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("ami-[a-zA-Z0-9]+-[a-zA-Z0-9]+");
        assertThat(matcher.find(), is(true));
    }

}