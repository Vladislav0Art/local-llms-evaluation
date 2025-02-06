package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_EmptyString_ReturnsEmptyString {

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        String packageName = AppVersion.getPackageName("");
        assertEquals("", packageName);
    }

}