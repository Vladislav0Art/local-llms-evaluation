package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedParseName_InvalidNameThrowsException {

    @Test
    public void parseName_InvalidNameThrowsException() {
        String amiName = " invalid name";
        try {
            AppVersion.parseName(amiName);
            fail("Expected an exception");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}