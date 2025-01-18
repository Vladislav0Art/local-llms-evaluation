package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String expected = "App2";
        AppVersion appVersion = AppVersion.parseName(expected);
        assertEquals(expected, appVersion.toString());
    }

}