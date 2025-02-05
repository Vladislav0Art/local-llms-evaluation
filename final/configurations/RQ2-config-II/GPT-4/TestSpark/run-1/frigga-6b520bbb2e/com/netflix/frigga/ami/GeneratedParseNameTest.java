package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix:2.1.3:h12.345:b1234:abcdef");
        assertEquals("com.netflix", appVersion.getPackageName());
        assertEquals("2.1.3", appVersion.getVersion());
        assertEquals("h12.345", appVersion.getBuildJobName());
        assertEquals("b1234", appVersion.getBuildNumber());
        assertEquals("abcdef", appVersion.getCommit());
    }

}