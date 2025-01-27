package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseNameInvalidName_test {

    @Test
    public void parseNameInvalidName_test() {
        String amiName = "invalid";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

}