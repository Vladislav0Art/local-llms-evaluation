package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("");
        assertThat(matcher.find(), is(true));
    }

}