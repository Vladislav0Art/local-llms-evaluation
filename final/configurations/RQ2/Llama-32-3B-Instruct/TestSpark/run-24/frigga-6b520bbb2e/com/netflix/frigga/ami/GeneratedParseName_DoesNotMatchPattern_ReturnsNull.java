package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_DoesNotMatchPattern_ReturnsNull {

    @Test
    public void parseName_DoesNotMatchPattern_ReturnsNull() {
        String amiName = "invalid name";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

}