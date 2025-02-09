package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersionValidFormatTest {

    @Test
    public void getVersionValidFormatTest() {
        AppVersion appVersion = new AppVersion("test", "1.0");
        assertEquals("1.0", appVersion.getVersion());
    }

}