package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ReturnsValidVersion {

    @Test
    public void getVersion_ReturnsValidVersion() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals("1.0-1234567890", appVersion.getVersion());
    }

}