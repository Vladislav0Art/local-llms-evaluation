package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildNumber_valid_build_number_test {

    @Test
    public void getBuildNumber_valid_build_number_test() {
        String amiName = "1.0-20161209T140000Z";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals("12345", parsed.getBuildNumber());
    }

}