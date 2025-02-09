package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageNameEmptyStringReturnsBlankTest {

    @Test
    public void getPackageNameEmptyStringReturnsBlankTest() {
        AppVersion appVersion = new AppVersion("", "1.0");
        assertEquals("", appVersion.getPackageName());
    }

}