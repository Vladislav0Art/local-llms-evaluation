package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedGetAppVersionPattern_MatchesInvalidString_DoesNotReturnMatchedPattern {

    @Test
    public void getAppVersionPattern_MatchesInvalidString_DoesNotReturnMatchedPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("invalid-string");
        assertFalse(matcher.matches());
    }

}