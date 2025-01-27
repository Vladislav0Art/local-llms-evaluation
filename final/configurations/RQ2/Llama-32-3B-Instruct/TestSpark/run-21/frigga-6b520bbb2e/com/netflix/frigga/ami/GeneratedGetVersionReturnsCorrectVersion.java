package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersionReturnsCorrectVersion {

    @Test
    public void getVersionReturnsCorrectVersion() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals("1.0", appVersion.getVersion());
    }

}