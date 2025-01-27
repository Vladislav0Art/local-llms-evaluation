package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildNumberEmptyStringTest {

    @Test
    public void getBuildNumberEmptyStringTest() {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getBuildNumber());
    }

}