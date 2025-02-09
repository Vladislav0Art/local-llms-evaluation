package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternReturnsNullIfRegexIsInvalid {

    @Test
    public void getAppVersionPatternReturnsNullIfRegexIsInvalid() {
        AppVersion appVersion = new AppVersion();
        Pattern pattern = appVersion.getAppVersionPattern();
        assertNull(pattern);
    }

}