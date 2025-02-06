package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsExpectedStringRepresentation {

    @Test
    public void toString_ReturnsExpectedStringRepresentation() {
        String expectedToString = "AppVersion{version='1.0', build='build', job='job'}";
        AppVersion appVersion = new AppVersion("1.0", "build");
        assertEquals(expectedToString, appVersion.toString());
    }

}