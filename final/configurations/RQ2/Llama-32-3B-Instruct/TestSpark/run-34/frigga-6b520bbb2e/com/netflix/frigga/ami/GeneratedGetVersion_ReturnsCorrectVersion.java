package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ReturnsCorrectVersion {

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        AppVersion appVersion = new AppVersion("ami-123");
        assertEquals("123", appVersion.getVersion());
    }

}