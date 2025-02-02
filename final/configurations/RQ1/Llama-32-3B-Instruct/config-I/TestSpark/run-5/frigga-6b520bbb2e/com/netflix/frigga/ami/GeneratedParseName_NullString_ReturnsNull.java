package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_NullString_ReturnsNull {

    @Test
    public void parseName_NullString_ReturnsNull() {
        // given
        String amiName = null;

        // when
        AppVersion parsedName = AppVersion.parseName(amiName);

        // then
        assertNull(parsedName);
    }

}