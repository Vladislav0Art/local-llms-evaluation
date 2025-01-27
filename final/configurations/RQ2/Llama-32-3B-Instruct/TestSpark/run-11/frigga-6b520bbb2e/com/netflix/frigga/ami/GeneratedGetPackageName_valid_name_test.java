package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetPackageName_valid_name_test {

    @Test
    public void getPackageName_valid_name_test() {
        String amiName = "1.0-20161209T140000Z";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals("com.netflix.frigga", parsed.getPackageName());
    }

}