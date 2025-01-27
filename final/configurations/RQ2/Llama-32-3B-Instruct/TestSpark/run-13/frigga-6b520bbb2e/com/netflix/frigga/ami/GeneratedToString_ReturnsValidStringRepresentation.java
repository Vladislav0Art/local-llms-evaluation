package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsValidStringRepresentation {

    @Test
    public void toString_ReturnsValidStringRepresentation() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        String result = appVersion.toString();
        assertTrue(result.contains("1.0-"));
    }

}