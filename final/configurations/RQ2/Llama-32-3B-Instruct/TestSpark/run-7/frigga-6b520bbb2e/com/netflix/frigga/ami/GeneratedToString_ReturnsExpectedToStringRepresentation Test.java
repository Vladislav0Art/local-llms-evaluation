package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsExpectedToStringRepresentation Test {

    @Test
    public void toString_ReturnsExpectedToStringRepresentation

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        String expectedToString = "com.netflix.frigga.ami.AppVersion{version='1.0', buildNumber='123456789'}";
        assertEquals(expectedToString, appVersion.toString());
    }

}