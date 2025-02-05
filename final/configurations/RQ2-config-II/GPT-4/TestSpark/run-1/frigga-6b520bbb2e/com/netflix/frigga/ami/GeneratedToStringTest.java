package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix:2.1.3:h12.345:b1234:abcdef");
        assertEquals("com.netflix:2.1.3:h12.345:b1234:abcdef", appVersion.toString());
    }

}