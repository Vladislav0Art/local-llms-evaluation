package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidVersionThrowsException {

    @Test
    public void parseName_InvalidVersionThrowsException() {
        String amiName = "invalid-ami-name";
        assertThrows(Exception.class, () -> AppVersion.parseName(amiName));
    }

}