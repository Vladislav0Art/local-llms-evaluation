package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAmiName_ThrowsException {

    @Test
    public void parseName_InvalidAmiName_ThrowsException() {
        String amiName = "invalid-ami-name";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception");
        } catch (Exception e) {
            // Expected
        }
    }

}