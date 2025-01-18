package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String expected = "validAppName";
        AppVersion appVersion = AppVersion.parseName(expected);
        assertEquals(expected, appVersion.getPackageName());
    }

}