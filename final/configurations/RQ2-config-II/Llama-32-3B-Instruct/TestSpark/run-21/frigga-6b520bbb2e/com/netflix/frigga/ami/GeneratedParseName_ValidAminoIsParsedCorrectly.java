package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidAminoIsParsedCorrectly {

    @Test
    public void parseName_ValidAminoIsParsedCorrectly() {
        String amiName = "1.0.2-1234";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals("1.0.2", result.getVersion());
    }

}