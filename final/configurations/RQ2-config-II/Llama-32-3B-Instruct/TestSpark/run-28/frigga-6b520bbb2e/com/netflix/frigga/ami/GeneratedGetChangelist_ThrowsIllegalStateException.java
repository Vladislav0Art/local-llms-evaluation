package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedGetChangelist_ThrowsIllegalStateException {

    @Test
    public void getChangelist_ThrowsIllegalStateException() {
        try {
            AppVersion.appVersion().getChangelist();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Override
    public void testToStringReturnsToString() {
        AppVersion appVersion = AppVersion.parseName("1.0-ami-1234567890");
        assertEquals(appVersion.toString(), appVersion.getVersion());
    }

}