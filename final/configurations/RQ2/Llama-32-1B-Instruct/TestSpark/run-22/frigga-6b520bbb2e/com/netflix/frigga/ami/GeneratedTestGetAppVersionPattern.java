package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void TestGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern instanceof org.junit.jupiter.api.TestRule$MockRule);
        Mockito.when(AppVersion.getAppVersionPattern()).thenReturn(pattern);
        String expectedPattern = "^[A-Za-z0-9.-]+$";
        assertEquals(expectedPattern, AppVersion.getAppVersionPattern().toString());
    }

}