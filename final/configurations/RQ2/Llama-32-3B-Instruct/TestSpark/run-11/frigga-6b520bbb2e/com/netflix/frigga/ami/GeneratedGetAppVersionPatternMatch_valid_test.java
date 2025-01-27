package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetAppVersionPatternMatch_valid_test {

    @Test
    public void getAppVersionPatternMatch_valid_test() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("1.0-20161209T140000Z");
        assertTrue(matcher.matches());
    }

}