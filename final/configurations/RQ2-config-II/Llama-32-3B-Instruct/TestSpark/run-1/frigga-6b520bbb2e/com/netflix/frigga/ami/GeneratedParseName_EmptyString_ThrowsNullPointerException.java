package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_EmptyString_ThrowsNullPointerException {

    @Test
    public void parseName_EmptyString_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.parseName(""));
    }

}