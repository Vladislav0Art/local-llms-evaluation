package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedTestEquals ReturnsEqualObjects {

    @Test
    public void testEquals

    ReturnsEqualObjects() {
        AppVersion appVersion1 = AppVersion.parseName("1.0-ami-1234567890");
        AppVersion appVersion2 = AppVersion.parseName("1.0-ami-1234567890");
        assertTrue(appVersion1.equals(appVersion2));
    }

}