package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAppVersionPattern_PatternMatches {

    @Test
    public void testGetAppVersionPattern_PatternMatches() {
        String pattern = "^([A-Za-z0-9]+)-[A-Z]{2}-(\d{8})$";
        Matcher matcher = AppVersion.getAppVersionPattern().matcher("Example_AMI-12345678");
        assertTrue(matcher.matches());
    }

}