package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_ReturnsPattern {

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        // given
        Pattern pattern = AppVersion.PUBLIC_APP_VERSION_PATTERN;

        // when
        Pattern returnedPattern = AppVersion.getAppVersionPattern();

        // then
        assertEquals(pattern, returnedPattern);
    }

}