package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedParseName_InvalidAminame_ThrowsNullPointerException {

    @Test
    public void parseName_InvalidAminame_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.parseName("123"));
    }

}