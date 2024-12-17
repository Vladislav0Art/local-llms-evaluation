package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_InvalidFormat_ReturnsNull {

    @Test
    public void parseName_InvalidFormat_ReturnsNull() {
        String amiName = "12345";
        assertNull(AppVersion.parseName(amiName));
    }

}