package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_EmptyString_ReturnsNull {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        AppVersion result = AppVersion.parseName("");
        assert null != result;
    }

}