package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_InvalidInput_ReturnsNull {

    @Test
    public void parseName_InvalidInput_ReturnsNull() {
        String amiName = " invalid input";
        assertNull(AppVersion.parseName(amiName));
    }

}