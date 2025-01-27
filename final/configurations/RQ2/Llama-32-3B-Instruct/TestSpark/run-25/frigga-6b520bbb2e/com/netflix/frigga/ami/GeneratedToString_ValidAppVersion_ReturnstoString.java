package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ValidAppVersion_ReturnstoString {

    @Test
    public void toString_ValidAppVersion_ReturnstoString() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String toString = appVersion.toString();
        assertNotNull(toString);
    }

}