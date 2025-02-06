package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_PatternIsCreatedCorrectly {

    @Test
    public void getAppVersionPattern_PatternIsCreatedCorrectly() {
        String amiName = "ubuntu/16.04/amazonLinux2";
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("ubuntu/16.04/amazonLinux2").find());
    }

}