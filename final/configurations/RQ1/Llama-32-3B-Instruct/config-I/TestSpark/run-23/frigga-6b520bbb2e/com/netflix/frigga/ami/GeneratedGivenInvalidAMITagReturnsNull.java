package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class GeneratedGivenInvalidAMITagReturnsNull {

    private AppVersion parseName(String amiName) {
        return new AppVersion().parseName(amiName);
    }

    @Test
    public void givenInvalidAMITagReturnsNull() {
        assertEquals(null, parseName(" invalid"));
    }

}