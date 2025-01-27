package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetAppVersionPatternNoMatch_invalid_test {

    @Test
    public void getAppVersionPatternNoMatch_invalid_test() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("invalid");
        assertFalse(matcher.matches());
    }

}