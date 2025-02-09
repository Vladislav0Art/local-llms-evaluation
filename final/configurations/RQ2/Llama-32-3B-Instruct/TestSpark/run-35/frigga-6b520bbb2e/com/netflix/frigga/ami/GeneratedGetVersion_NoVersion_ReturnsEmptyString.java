package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedGetVersion_NoVersion_ReturnsEmptyString {

    @Test
    public void getVersion_NoVersion_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion("my-package", "");
        assertEquals("", appVersion.getVersion());
    }

}