package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedGetVersion_ReturnsVersion {

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = AppVersion.parseName("1.0-ami-1234567890");
        assertEquals("1.0", appVersion.getVersion());
    }

}