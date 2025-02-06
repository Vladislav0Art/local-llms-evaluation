package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_OurApp {

    @Test
    public void parseName_OurApp() {
        String amiName = "my-our-app:1.0";
        AppVersion result = AppVersion.parseName(amiName);
        assertEquals("my-our-app", result.getPackageName());
        assertEquals("1.0", result.getVersion());
    }

}