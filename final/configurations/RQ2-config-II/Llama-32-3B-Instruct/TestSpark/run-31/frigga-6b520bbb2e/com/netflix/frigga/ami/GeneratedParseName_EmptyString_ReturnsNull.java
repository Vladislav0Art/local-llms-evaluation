package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_EmptyString_ReturnsNull {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

}