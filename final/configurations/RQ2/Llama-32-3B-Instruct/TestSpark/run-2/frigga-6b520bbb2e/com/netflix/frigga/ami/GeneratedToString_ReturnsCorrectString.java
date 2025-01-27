package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsCorrectString {

    @Test
    public void toString_ReturnsCorrectString() {
        String string = AppVersion.toString();
        assertNotNull(string);
        assertTrue(string.matches("\\d+\\.\\d+\\.\\d+-[a-zA-Z0-9]+"));
    }

}