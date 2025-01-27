package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAppVersionPattern_ReturnsCorrectPattern {

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        String pattern = AppVersion.getAppVersionPattern().pattern();
        assertEquals("\\d+\\.\\d+-([a-zA-Z]+)-[a-zA-Z_]+-[0-9]+", pattern);
    }

}