package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidFormat {

    @Test
    public void parseName_InvalidFormat() {
        String amiName = "invalid-ami-name";
        try {
            AppVersion.parseName(amiName);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        }
    }

}