package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedParseName_InvalidFormatTest {

    @Test
    public void parseName_InvalidFormatTest() {
        String amiName = " invalid format";
        try {
            AppVersion.parseName(amiName);
            assertTrue(false);
        } catch (Exception e) {
        }
    }

}