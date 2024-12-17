package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedParseName_InvalidAMIName_ThrowsParseException {

    @Test
    public void parseName_InvalidAMIName_ThrowsParseException() {
        try {
            AppVersion.parseName("1.2.3-4.");
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            // expected exception
        }
    }

}