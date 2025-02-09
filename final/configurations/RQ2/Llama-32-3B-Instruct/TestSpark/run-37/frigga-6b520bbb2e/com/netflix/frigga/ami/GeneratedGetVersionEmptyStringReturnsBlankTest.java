package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersionEmptyStringReturnsBlankTest {

    @Test
    public void getVersionEmptyStringReturnsBlankTest() {
        AppVersion appVersion = new AppVersion("", "");
        assertEquals("", appVersion.getVersion());
    }

}