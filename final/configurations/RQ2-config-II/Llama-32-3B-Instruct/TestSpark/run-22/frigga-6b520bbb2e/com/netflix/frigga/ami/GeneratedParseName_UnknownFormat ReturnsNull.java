package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_UnknownFormat ReturnsNull {

    @Test
    public void parseName_UnknownFormat

    ReturnsNull() {
        AppVersion result = AppVersion.parseName("unknown");
        assertNull(result);
    }

}