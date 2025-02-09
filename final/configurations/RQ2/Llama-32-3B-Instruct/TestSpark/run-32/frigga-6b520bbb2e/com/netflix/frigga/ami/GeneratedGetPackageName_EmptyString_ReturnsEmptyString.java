package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_EmptyString_ReturnsEmptyString {

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        String amiName = "";
        String result = AppVersion.parseName(amiName).getPackageName();
        assertEquals("", result);
    }

}