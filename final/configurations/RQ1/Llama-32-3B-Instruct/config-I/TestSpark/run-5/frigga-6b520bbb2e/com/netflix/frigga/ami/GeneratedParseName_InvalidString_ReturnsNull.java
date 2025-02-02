package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidString_ReturnsNull {

    @Test
    public void parseName_InvalidString_ReturnsNull() {
        // given
        String amiName = "invalid";

        // when
        AppVersion parsedName = AppVersion.parseName(amiName);

        // then
        assertNull(parsedName);
    }

}