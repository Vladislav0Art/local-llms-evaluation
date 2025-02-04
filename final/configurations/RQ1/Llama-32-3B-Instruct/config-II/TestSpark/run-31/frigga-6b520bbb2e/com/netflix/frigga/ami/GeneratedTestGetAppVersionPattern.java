package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void testGetAppVersionPattern() {
        AppVersionTest test = new AppVersionTest();
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

}