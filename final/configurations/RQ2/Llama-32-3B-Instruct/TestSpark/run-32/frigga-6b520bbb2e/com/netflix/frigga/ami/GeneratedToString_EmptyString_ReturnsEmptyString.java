package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_EmptyString_ReturnsEmptyString {

    @Test
    public void toString_EmptyString_ReturnsEmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion(amiName);
        String result = appVersion.toString();
        assertEquals("", result);
    }

}