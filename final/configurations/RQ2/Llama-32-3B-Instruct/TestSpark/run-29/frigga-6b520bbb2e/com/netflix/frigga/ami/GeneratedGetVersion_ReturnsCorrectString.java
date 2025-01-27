package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetVersion_ReturnsCorrectString {

    @Test
    public void getVersion_ReturnsCorrectString() {
        String version = "1.0-123";
        AppVersion appVersion = new AppVersion();
        assertEquals(version, appVersion.getVersion());
    }

}