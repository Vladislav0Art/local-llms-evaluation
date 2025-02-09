package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameInvalidFormatTest {

    @Test
    public void parseNameInvalidFormatTest() {
        String amiName = "invalid-format";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}