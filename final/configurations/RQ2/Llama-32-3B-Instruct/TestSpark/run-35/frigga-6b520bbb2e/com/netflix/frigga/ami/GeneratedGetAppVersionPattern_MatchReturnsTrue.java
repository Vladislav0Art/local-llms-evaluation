package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedGetAppVersionPattern_MatchReturnsTrue {

    @Test
    public void getAppVersionPattern_MatchReturnsTrue() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("my-package/my-version").find());
    }

}