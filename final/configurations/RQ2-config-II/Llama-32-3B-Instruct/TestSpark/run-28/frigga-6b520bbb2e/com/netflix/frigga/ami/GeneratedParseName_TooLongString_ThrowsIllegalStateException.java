package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedParseName_TooLongString_ThrowsIllegalStateException {

    @Test
    public void parseName_TooLongString_ThrowsIllegalStateException() {
        try {
            AppVersion.parseName("a".repeat(10000));
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

}