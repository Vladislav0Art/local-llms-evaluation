package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedParseName_NullInput Test {

    @Test
    public void parseName_NullInput

    Test() {
        String amiName = null;
        try {
            AppVersion.parseName(amiName);
            assertTrue(false);
        } catch (Exception e) {
        }
    }

}