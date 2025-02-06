package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidAmaridReturnCorrectInstance {

    @Test
    public void parseName_ValidAmaridReturnCorrectInstance() {
        String amiName = "ami-1234";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals("ami-1234", result.toString());
    }

}