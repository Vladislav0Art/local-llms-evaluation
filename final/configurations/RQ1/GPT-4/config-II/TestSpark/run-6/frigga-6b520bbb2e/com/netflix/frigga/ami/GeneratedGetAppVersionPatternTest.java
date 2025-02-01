package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Pattern appVersionPattern = AppVersion.getAppVersionPattern();
        assertNotNull(appVersionPattern);
        assertTrue(appVersionPattern.pattern().contains(NameConstants.NAME_HYPHEN_CHARS));
    }

}