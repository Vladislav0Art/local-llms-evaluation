package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ObjectEquals_ParsesSuccessfully {

    @Test
    public void equals_ObjectEquals_ParsesSuccessfully() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();

        boolean result = AppVersion.equals(version1, version2);
        assertTrue(result);
    }

}