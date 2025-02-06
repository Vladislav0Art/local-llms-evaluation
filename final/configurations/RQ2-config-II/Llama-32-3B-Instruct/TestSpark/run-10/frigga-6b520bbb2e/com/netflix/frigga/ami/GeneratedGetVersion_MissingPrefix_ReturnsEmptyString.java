package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_MissingPrefix_ReturnsEmptyString {

    private AppVersion appVersion;

    @Test
    public void getVersion_MissingPrefix_ReturnsEmptyString() {
        appVersion = AppVersion.parseName("region-1234");
        assertEquals("", appVersion.getVersion());
    }

}