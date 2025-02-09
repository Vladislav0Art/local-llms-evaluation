package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAminame_ThrowsNullPointerException {

    @Test
    public void parseName_InvalidAminame_ThrowsNullPointerException() {
        String amiName = "";
        assertThrows(NullPointerException.class, () -> AppVersion.parseName(amiName));
    }

}