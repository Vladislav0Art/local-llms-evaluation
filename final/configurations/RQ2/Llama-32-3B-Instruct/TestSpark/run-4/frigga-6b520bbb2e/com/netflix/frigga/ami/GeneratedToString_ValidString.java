package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ValidString {

    @Test
    public void toString_ValidString() {
        String amiName = "ami-123456789012345678901234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion.toString());
    }

}