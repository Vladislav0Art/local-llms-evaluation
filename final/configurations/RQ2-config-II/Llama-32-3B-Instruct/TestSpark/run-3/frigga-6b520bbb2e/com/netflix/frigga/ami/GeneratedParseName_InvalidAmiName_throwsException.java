package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAmiName_throwsException {

    @Test
    public void parseName_InvalidAmiName_throwsException() {
        String amiName = "invalid";
        try {
            AppVersion.parseName(amiName);
            fail();
        } catch (Exception e) {
            // expected
        }
    }

}