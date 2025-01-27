package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameInvalidAmiName_ThrowsNullPointerException {

    @Test
    public void parseNameInvalidAmiName_ThrowsNullPointerException() {
        String amiName = " invalid ";
        try {
            AppVersion.parseName(amiName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}