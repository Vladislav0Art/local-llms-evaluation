package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameInvalidAmeiNameThrowsException {

    @Test
    public void parseNameInvalidAmeiNameThrowsException() {
        String amiName = "invalid-amei-name";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

}