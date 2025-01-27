package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedToString_ReturnsExpectedString {

    @Test
    public void toString_ReturnsExpectedString() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String toStringValue = appVersion.toString();
        assertNotNull(toStringValue);
    }

}