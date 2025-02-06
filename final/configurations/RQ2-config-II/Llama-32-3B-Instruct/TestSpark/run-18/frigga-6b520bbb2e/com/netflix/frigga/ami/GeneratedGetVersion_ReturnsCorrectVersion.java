package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetVersion_ReturnsCorrectVersion {

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getVersion(), is("true"));
    }

}